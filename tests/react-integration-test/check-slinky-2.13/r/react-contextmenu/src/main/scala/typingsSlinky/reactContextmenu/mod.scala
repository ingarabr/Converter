package typingsSlinky.reactContextmenu

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactText
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-contextmenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "ContextMenu")
  @js.native
  class ContextMenu protected ()
    extends Component[ContextMenuProps, js.Object, js.Any] {
    def this(props: ContextMenuProps) = this()
    def this(props: ContextMenuProps, context: js.Any) = this()
  }
  @JSImport("react-contextmenu", "ContextMenu")
  @js.native
  val ContextMenu: ReactComponentClass[ContextMenuProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "ContextMenuTrigger")
  @js.native
  class ContextMenuTrigger protected ()
    extends Component[ContextMenuTriggerProps, js.Object, js.Any] {
    def this(props: ContextMenuTriggerProps) = this()
    def this(props: ContextMenuTriggerProps, context: js.Any) = this()
  }
  @JSImport("react-contextmenu", "ContextMenuTrigger")
  @js.native
  val ContextMenuTrigger: ReactComponentClass[ContextMenuTriggerProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "MenuItem")
  @js.native
  class MenuItem protected ()
    extends Component[MenuItemProps, js.Object, js.Any] {
    def this(props: MenuItemProps) = this()
    def this(props: MenuItemProps, context: js.Any) = this()
  }
  @JSImport("react-contextmenu", "MenuItem")
  @js.native
  val MenuItem: ReactComponentClass[MenuItemProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-contextmenu", "SubMenu")
  @js.native
  class SubMenu protected ()
    extends Component[SubMenuProps, js.Object, js.Any] {
    def this(props: SubMenuProps) = this()
    def this(props: SubMenuProps, context: js.Any) = this()
  }
  @JSImport("react-contextmenu", "SubMenu")
  @js.native
  val SubMenu: ReactComponentClass[SubMenuProps] = js.native
  
  @scala.inline
  def connectMenu(menuId: String): js.Function1[/* menu */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(menuId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* menu */ js.Any, js.Any]]
  
  @scala.inline
  def hideMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")().asInstanceOf[Unit]
  @scala.inline
  def hideMenu(opts: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def hideMenu(opts: js.Any, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def hideMenu(opts: Unit, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hideMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def showMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")().asInstanceOf[Unit]
  @scala.inline
  def showMenu(opts: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def showMenu(opts: js.Any, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def showMenu(opts: Unit, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(opts.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ContextMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var hideOnLeave: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var onHide: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        (js.Function3[
          /* event */ SyntheticMouseEvent[HTMLElement], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
          /* target */ HTMLElement, 
          Unit
        ]) | js.Function
      ] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
  }
  object ContextMenuProps {
    
    @scala.inline
    def apply(id: String): ContextMenuProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuProps]
    }
    
    @scala.inline
    implicit class ContextMenuPropsMutableBuilder[Self <: ContextMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHideOnLeave(value: Boolean): Self = StObject.set(x, "hideOnLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnLeaveUndefined: Self = StObject.set(x, "hideOnLeave", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHide(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(
        value: (js.Function3[
              /* event */ SyntheticMouseEvent[HTMLElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveFunction3(
        value: (/* event */ SyntheticMouseEvent[HTMLElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, /* target */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  trait ContextMenuTriggerProps extends StObject {
    
    var attributes: js.UndefOr[HTMLAttributes[js.Any]] = js.undefined
    
    var collect: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var holdToDisplay: js.UndefOr[Double] = js.undefined
    
    var id: String
    
    var renderTag: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object ContextMenuTriggerProps {
    
    @scala.inline
    def apply(id: String): ContextMenuTriggerProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuTriggerProps]
    }
    
    @scala.inline
    implicit class ContextMenuTriggerPropsMutableBuilder[Self <: ContextMenuTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: HTMLAttributes[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setCollect(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "collect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setHoldToDisplay(value: Double): Self = StObject.set(x, "holdToDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoldToDisplayUndefined: Self = StObject.set(x, "holdToDisplay", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTag(value: ReactType[js.Any]): Self = StObject.set(x, "renderTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTagUndefined: Self = StObject.set(x, "renderTag", js.undefined)
    }
  }
  
  trait MenuItemProps extends StObject {
    
    var attributes: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any
      ] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var divider: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        (js.Function3[
          /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
          /* target */ HTMLElement, 
          Unit
        ]) | js.Function
      ] = js.undefined
    
    var preventClose: js.UndefOr[Boolean] = js.undefined
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ js.Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (js.Function3[
              /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickFunction3(
        value: (/* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, /* target */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPreventClose(value: Boolean): Self = StObject.set(x, "preventClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventCloseUndefined: Self = StObject.set(x, "preventClose", js.undefined)
    }
  }
  
  trait SubMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hoverDelay: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[
        (js.Function3[
          /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
          /* target */ HTMLElement, 
          Unit
        ]) | js.Function
      ] = js.undefined
    
    var preventCloseOnClick: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var title: ReactElement | ReactText
  }
  object SubMenuProps {
    
    @scala.inline
    def apply(title: ReactElement | ReactText): SubMenuProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuProps]
    }
    
    @scala.inline
    implicit class SubMenuPropsMutableBuilder[Self <: SubMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (js.Function3[
              /* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
              /* target */ HTMLElement, 
              Unit
            ]) | js.Function
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickFunction3(
        value: (/* event */ SyntheticTouchEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, /* target */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPreventCloseOnClick(value: Boolean): Self = StObject.set(x, "preventCloseOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventCloseOnClickUndefined: Self = StObject.set(x, "preventCloseOnClick", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement | ReactText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
