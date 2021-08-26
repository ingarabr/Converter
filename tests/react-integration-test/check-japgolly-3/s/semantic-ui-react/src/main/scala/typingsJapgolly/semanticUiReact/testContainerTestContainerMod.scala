package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.util.Effect.Sync
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testContainerTestContainerMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/TestContainer/TestContainer", JSImport.Default)
  @js.native
  val default: StatelessComponent[TestContainerProps] = js.native
  
  trait StrictTestContainerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** TestContainer has no maximum width. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /**Should be CallbackTo[Number]*/
    var optFn0Number: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /**Should be Callback*/
    var optFn0Void: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**Should be (x:Number) => CallbackTo[Number]*/
    var optFn1Number: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    /**Should be (x:Number) => Callback*/
    var optFn1Void: js.UndefOr[js.Function1[/* x */ Double, Unit]] = js.undefined
    
    /**Should be CallbackTo[Number]*/
    def requiredFn0Number(): Double
    
    /**Should be Callback*/
    def requiredFn0Void(): Unit
    
    /**Should be (x:Number) => CallbackTo[Number]*/
    def requiredFn1Number(x: Double): Double
    
    /**Should be (x:Number) => Callback*/
    def requiredFn1Void(x: Double): Unit
    
    /** Reduce maximum width to more naturally accommodate text. */
    var text: js.UndefOr[Boolean] = js.undefined
    
    /** Describes how the text inside this component should be aligned. */
    var textAlign: js.UndefOr[SemanticTEXTALIGNMENTS] = js.undefined
  }
  object StrictTestContainerProps {
    
    inline def apply[F[_]](
      requiredFn0Number: F[Double],
      requiredFn0Void: F[Unit],
      requiredFn1Number: Double => Double,
      requiredFn1Void: Double => F[Unit]
    )(
      implicit _sync: Sync[F]
    ): StrictTestContainerProps = {
      val __obj = js.Dynamic.literal(requiredFn0Number = _sync.toJsFn(requiredFn0Number), requiredFn0Void = _sync.toJsFn(requiredFn0Void), requiredFn1Number = js.Any.fromFunction1(requiredFn1Number), requiredFn1Void = js.Any.fromFunction1((t0: Double) => _sync.runSync(requiredFn1Void(t0))))
      __obj.asInstanceOf[StrictTestContainerProps]
    }
    
    extension [Self <: StrictTestContainerProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setOptFn0Number[F[_]](value: F[Double])(implicit _sync: Sync[F]): Self = StObject.set(x, "optFn0Number", _sync.toJsFn(value))
      
      inline def setOptFn0NumberUndefined: Self = StObject.set(x, "optFn0Number", js.undefined)
      
      inline def setOptFn0Void[F[_]](value: F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "optFn0Void", _sync.toJsFn(value))
      
      inline def setOptFn0VoidUndefined: Self = StObject.set(x, "optFn0Void", js.undefined)
      
      inline def setOptFn1Number(value: /* x */ Double => Double): Self = StObject.set(x, "optFn1Number", js.Any.fromFunction1(value))
      
      inline def setOptFn1NumberUndefined: Self = StObject.set(x, "optFn1Number", js.undefined)
      
      inline def setOptFn1Void[F[_]](value: /* x */ Double => F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "optFn1Void", js.Any.fromFunction1((t0: /* x */ Double) => _sync.runSync(value(t0))))
      
      inline def setOptFn1VoidUndefined: Self = StObject.set(x, "optFn1Void", js.undefined)
      
      inline def setRequiredFn0Number[F[_]](value: F[Double])(implicit _sync: Sync[F]): Self = StObject.set(x, "requiredFn0Number", _sync.toJsFn(value))
      
      inline def setRequiredFn0Void[F[_]](value: F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "requiredFn0Void", _sync.toJsFn(value))
      
      inline def setRequiredFn1Number(value: Double => Double): Self = StObject.set(x, "requiredFn1Number", js.Any.fromFunction1(value))
      
      inline def setRequiredFn1Void[F[_]](value: Double => F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "requiredFn1Void", js.Any.fromFunction1((t0: Double) => _sync.runSync(value(t0))))
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: SemanticTEXTALIGNMENTS): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait TestContainerProps
    extends StObject
       with StrictTestContainerProps
       with /* key */ StringDictionary[js.Any]
  object TestContainerProps {
    
    inline def apply[F[_]](
      requiredFn0Number: F[Double],
      requiredFn0Void: F[Unit],
      requiredFn1Number: Double => Double,
      requiredFn1Void: Double => F[Unit]
    )(
      implicit _sync: Sync[F]
    ): TestContainerProps = {
      val __obj = js.Dynamic.literal(requiredFn0Number = _sync.toJsFn(requiredFn0Number), requiredFn0Void = _sync.toJsFn(requiredFn0Void), requiredFn1Number = js.Any.fromFunction1(requiredFn1Number), requiredFn1Void = js.Any.fromFunction1((t0: Double) => _sync.runSync(requiredFn1Void(t0))))
      __obj.asInstanceOf[TestContainerProps]
    }
  }
  
  type _To = StatelessComponent[TestContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `testContainerTestContainerMod.foo` */
  override def _to: StatelessComponent[TestContainerProps] = default
}
