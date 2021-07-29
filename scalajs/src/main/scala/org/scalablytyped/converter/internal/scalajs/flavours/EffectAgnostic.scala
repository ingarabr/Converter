package org.scalablytyped.converter.internal
package scalajs
package flavours

case class EffectAgnostic(typeParam: TypeParamTree, constraints: IArray[ParamTree]) {
  val qname = QualifiedName(IArray(typeParam.name))

  def canApplyTo(tree: MethodTree): Boolean =
    TreeTraverse.collect(tree) { case typeRef: TypeRef if typeRef.typeName === qname => null }.nonEmpty

  require(constraints.forall(_.isImplicit))
}

object EffectAgnostic {
  def apply(effects: IArray[EffectAgnostic])(method: MethodTree): MethodTree =
    effects.distinct match {
      case Empty => method
      case some =>
        some.foldLeft(method) {
          case (method, one) if one.canApplyTo(method) =>
            method.copy(
              tparams = one.typeParam +: method.tparams,
              params  = method.params ++ IArray(one.constraints),
            )
          case (method, _) => method
        }
    }

  def patch(maybeEffect: Option[EffectAgnostic])(methodTree: MethodTree): MethodTree =
    apply(IArray.fromOption(maybeEffect))(methodTree)

  def patch(props: IArray[Prop])(methodTree: MethodTree): MethodTree = {
    val effects: IArray[EffectAgnostic] =
      props.mapNotNone {
        case Prop.Normal(Prop.Variant(_, _, _, _, maybeEffect), _, _, _, _) => maybeEffect
        case _                                                              => None
      }

    apply(effects)(methodTree)
  }
}
