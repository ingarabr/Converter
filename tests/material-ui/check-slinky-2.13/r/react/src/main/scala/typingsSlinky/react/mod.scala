package typingsSlinky.react

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.react.anon.Children
import typingsSlinky.react.anon.Html
import typingsSlinky.react.reactStrings.foo
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait AllHTMLAttributes[T]
    extends StObject
       with HTMLAttributes[T] {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var acceptCharset: js.UndefOr[String] = js.undefined
  }
  object AllHTMLAttributes {
    
    @scala.inline
    def apply[T](): AllHTMLAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllHTMLAttributes[T]]
    }
    
    @scala.inline
    implicit class AllHTMLAttributesMutableBuilder[Self <: AllHTMLAttributes[_], T] (val x: Self with AllHTMLAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    }
  }
  
  trait Component[P, S] extends StObject
  
  @js.native
  trait ComponentClass[P]
    extends StObject
       with Instantiable1[/* props */ P, ReactComponentClass[P]]
       with Instantiable2[/* props */ P, /* context */ js.Any, ReactComponentClass[P]] {
    
    var defaultProps: js.UndefOr[Partial[P]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type ComponentState = js.Object
  
  type ComponentType[P] = ReactComponentClass[P]
  
  trait DOMAttributes[T] extends StObject {
    
    var children: js.UndefOr[slinky.core.facade.ReactElement] = js.undefined
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
    
    var onClick: js.UndefOr[Double | (js.Function1[/* x */ String, Unit])] = js.undefined
  }
  object DOMAttributes {
    
    @scala.inline
    def apply[T](): DOMAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMAttributes[T]]
    }
    
    @scala.inline
    implicit class DOMAttributesMutableBuilder[Self <: DOMAttributes[_], T] (val x: Self with DOMAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: slinky.core.facade.ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setOnClick(value: Double | (js.Function1[/* x */ String, Unit])): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickFunction1(value: /* x */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait HTMLAttributes[T]
    extends StObject
       with DOMAttributes[T] {
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
  }
  object HTMLAttributes {
    
    @scala.inline
    def apply[T](): HTMLAttributes[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLAttributes[T]]
    }
    
    @scala.inline
    implicit class HTMLAttributesMutableBuilder[Self <: HTMLAttributes[_], T] (val x: Self with HTMLAttributes[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    }
  }
  
  trait HTMLProps[T]
    extends StObject
       with AllHTMLAttributes[T] {
    
    var defaultValue: foo
    
    var onChange: foo
    
    var `type`: foo
    
    var value: foo
  }
  object HTMLProps {
    
    @scala.inline
    def apply[T](): HTMLProps[T] = {
      val __obj = js.Dynamic.literal(defaultValue = "foo", onChange = "foo", value = "foo")
      __obj.updateDynamic("type")("foo")
      __obj.asInstanceOf[HTMLProps[T]]
    }
    
    @scala.inline
    implicit class HTMLPropsMutableBuilder[Self <: HTMLProps[_], T] (val x: Self with HTMLProps[T]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: foo): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: foo): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: foo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: foo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Key = String | Double
  
  trait ReactElement extends StObject {
    
    var key: Key | Null
    
    var props: js.Any
    
    var `type`: String | ReactComponentClass[js.Any]
  }
  object ReactElement {
    
    @scala.inline
    def apply(props: js.Any, `type`: String | ReactComponentClass[js.Any]): ReactElement = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactElement]
    }
    
    @scala.inline
    implicit class ReactElementMutableBuilder[Self <: ReactElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String | ReactComponentClass[js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeReactComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactNode = js.UndefOr[String | Double | Boolean]
  
  type SFC[P] = ReactComponentClass[P]
  
  type SVGAttributes[T] = DOMAttributes[T]
  
  @js.native
  trait StatelessComponent[P] extends StObject {
    
    def apply(props: P with Children): slinky.core.facade.ReactElement | Null = js.native
    def apply(props: P with Children, context: js.Any): slinky.core.facade.ReactElement | Null = js.native
    
    var defaultProps: js.UndefOr[Partial[P]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
}
