package typingsJapgolly.componentstest

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.componentstest.anon.Equals
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("componentstest", "Card")
  @js.native
  val Card: CardInterface = js.native
  
  @JSImport("componentstest", "Component")
  @js.native
  val Component: ComponentType[Props] = js.native
  
  @JSImport("componentstest", "Grid")
  @js.native
  val Grid: FC[CardGridProps] = js.native
  
  @JSImport("componentstest", "ObjectNames")
  @js.native
  val ObjectNames: FC[Equals] = js.native
  
  trait A
    extends StObject
       with Props {
    
    def aCallback(): Double
    
    var aMember: Double
  }
  object A {
    
    inline def apply[F[_]](aCallback: F[Double], aMember: Double)(implicit _sync: Sync[F]): A = {
      val __obj = js.Dynamic.literal(aCallback = _sync.toJsFn(aCallback), aMember = aMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    extension [Self <: A](x: Self) {
      
      inline def setACallback[F[_]](value: F[Double])(implicit _sync: Sync[F]): Self = StObject.set(x, "aCallback", _sync.toJsFn(value))
      
      inline def setAMember(value: Double): Self = StObject.set(x, "aMember", value.asInstanceOf[js.Any])
    }
  }
  
  trait B
    extends StObject
       with Props {
    
    var bCallback: js.UndefOr[js.Function0[String]] = js.undefined
    
    var bMember: String
  }
  object B {
    
    inline def apply[F[_]](bMember: String)(implicit _sync: Sync[F]): B = {
      val __obj = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    extension [Self <: B](x: Self) {
      
      inline def setBCallback[F[_]](value: F[String])(implicit _sync: Sync[F]): Self = StObject.set(x, "bCallback", _sync.toJsFn(value))
      
      inline def setBCallbackUndefined: Self = StObject.set(x, "bCallback", js.undefined)
      
      inline def setBMember(value: String): Self = StObject.set(x, "bMember", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardGridProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardGridProps {
    
    inline def apply(): CardGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardGridProps]
    }
    
    extension [Self <: CardGridProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CardInterface
    extends StObject
       with FunctionComponent[CardProps] {
    
    var Grid2: FC[CardGridProps] = js.native
  }
  
  /* Inlined parent std.Omit<std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'title' | 'onClick'>, 'title'> */
  trait CardProps extends StObject {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object CardProps {
    
    inline def apply[F[_]]()(implicit _sync: Sync[F]): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    extension [Self <: CardProps](x: Self) {
      
      inline def setOnClick[F[_]](value: ReactMouseEventFrom[HTMLDivElement & Element] => F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => _sync.runSync(value(t0))))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.componentstest.mod.A
    - typingsJapgolly.componentstest.mod.B
  */
  trait Props extends StObject
  object Props {
    
    inline def A[F[_]](aCallback: F[Double], aMember: Double)(implicit _sync: Sync[F]): typingsJapgolly.componentstest.mod.A = {
      val __obj = js.Dynamic.literal(aCallback = _sync.toJsFn(aCallback), aMember = aMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.componentstest.mod.A]
    }
    
    inline def B[F[_]](bMember: String)(implicit _sync: Sync[F]): typingsJapgolly.componentstest.mod.B = {
      val __obj = js.Dynamic.literal(bMember = bMember.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.componentstest.mod.B]
    }
  }
}
