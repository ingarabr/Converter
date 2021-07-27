package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.util.Effect.Sync
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsJapgolly.semanticUiReact.testContainerTestContainerMod.TestContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TestContainer {
  
  inline def apply[F[_]](
    requiredFn0Number: F[Double],
    requiredFn0Void: F[Unit],
    requiredFn1Number: Double => Double,
    requiredFn1Void: Double => F[Unit]
  )(
    implicit _sync: Sync[F]
  ): Builder = {
    val __props = js.Dynamic.literal(requiredFn0Number = _sync.toJsFn(requiredFn0Number), requiredFn0Void = _sync.toJsFn(requiredFn0Void), requiredFn1Number = js.Any.fromFunction1(requiredFn1Number), requiredFn1Void = js.Any.fromFunction1((t0: Double) => _sync.runSync(requiredFn1Void(t0))))
    new Builder(js.Array(this.component, __props.asInstanceOf[TestContainerProps]))
  }
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/TestContainer/TestContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value :_*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    inline def optFn0Number[F[_]](value: F[Double])(implicit _sync: Sync[F]): this.type = set("optFn0Number", _sync.toJsFn(value))
    
    inline def optFn0Void[F[_]](value: F[Unit])(implicit _sync: Sync[F]): this.type = set("optFn0Void", _sync.toJsFn(value))
    
    inline def optFn1Number(value: /* x */ Double => Double): this.type = set("optFn1Number", js.Any.fromFunction1(value))
    
    inline def optFn1Void[F[_]](value: /* x */ Double => F[Unit])(implicit _sync: Sync[F]): this.type = set("optFn1Void", js.Any.fromFunction1((t0: /* x */ Double) => _sync.runSync(value(t0))))
    
    inline def text(value: Boolean): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TestContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
