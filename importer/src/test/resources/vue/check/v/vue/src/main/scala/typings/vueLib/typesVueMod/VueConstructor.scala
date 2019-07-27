package typings.vueLib.typesVueMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.stdLib.Record
import typings.vueLib.Anon_CreateElement
import typings.vueLib.typesOptionsMod.AsyncComponent
import typings.vueLib.typesOptionsMod.ComponentOptions
import typings.vueLib.typesOptionsMod.DefaultComputed
import typings.vueLib.typesOptionsMod.DefaultData
import typings.vueLib.typesOptionsMod.DefaultMethods
import typings.vueLib.typesOptionsMod.DefaultProps
import typings.vueLib.typesOptionsMod.DirectiveFunction
import typings.vueLib.typesOptionsMod.DirectiveOptions
import typings.vueLib.typesOptionsMod.FunctionalComponentOptions
import typings.vueLib.typesOptionsMod.PropsDefinition
import typings.vueLib.typesOptionsMod.RecordPropsDefinition
import typings.vueLib.typesOptionsMod.ThisTypedComponentOptionsWithArrayProps
import typings.vueLib.typesOptionsMod.ThisTypedComponentOptionsWithRecordProps
import typings.vueLib.typesPluginMod.PluginFunction
import typings.vueLib.typesPluginMod.PluginObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueConstructor[V /* <: Vue */]
  extends // ideally, the return type should just contains Props, not Record<keyof Props, any>. But TS requires Base constructors must all have the same return type.
Instantiable0[CombinedVueInstance[V, js.Object, js.Object, js.Object, Record[String, js.Any]]]
     with Instantiable1[
      (/* options */ ComponentOptions[V, DefaultData[V], DefaultMethods[V], DefaultComputed, PropsDefinition[DefaultProps]]) | (/* options */ ThisTypedComponentOptionsWithArrayProps[V, js.Object, js.Object, js.Object, String]) | (/* options */ ThisTypedComponentOptionsWithRecordProps[V, js.Object, js.Object, js.Object, js.Object]), 
      CombinedVueInstance[V, js.Object, js.Object, js.Object, Record[String, js.Any]]
    ] {
  var config: VueConfiguration = js.native
  def compile(template: String): Anon_CreateElement = js.native
  def component(id: String): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  def component(
    id: String,
    definition: ComponentOptions[V, DefaultData[V], DefaultMethods[V], DefaultComputed, PropsDefinition[DefaultProps]]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  def component[VC /* <: VueConstructor[Vue] */](id: String, constructor: VC): VC = js.native
  def component[Props](id: String, definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[V, js.Object, js.Object, js.Object, Props] = js.native
  def component[Data, Methods, Computed, Props](id: String, definition: AsyncComponent[Data, Methods, Computed, Props]): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("component")
  def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](id: String): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
  @JSName("component")
  def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](
    id: String,
    definition: ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames]
  ): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
  @JSName("component")
  def component_DataMethodsComputedProps[Data, Methods, Computed, Props](id: String): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("component")
  def component_DataMethodsComputedProps[Data, Methods, Computed, Props](
    id: String,
    definition: ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props]
  ): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("component")
  def component_PropNames_String[PropNames /* <: String */](id: String, definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[V, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
  @JSName("component")
  def component_VueConstructor(id: String): VueConstructor[Vue] = js.native
  def delete(`object`: js.Object, key: String): Unit = js.native
  def delete[T](array: js.Array[T], key: Double): Unit = js.native
  def directive(id: String): DirectiveOptions = js.native
  def directive(id: String, definition: DirectiveFunction): DirectiveOptions = js.native
  def directive(id: String, definition: DirectiveOptions): DirectiveOptions = js.native
  def extend(): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  def extend(
    options: ComponentOptions[V, DefaultData[V], DefaultMethods[V], DefaultComputed, PropsDefinition[DefaultProps]]
  ): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
  def extend[Props](definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[V, js.Object, js.Object, js.Object, Props] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](options: ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames]): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("extend")
  def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](options: ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props]): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
  @JSName("extend")
  def extend_PropNames_String[PropNames /* <: String */](definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[V, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
  def filter(id: String): js.Function = js.native
  def filter(id: String, definition: js.Function): js.Function = js.native
  def mixin(
    mixin: ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps]
    ]
  ): Unit = js.native
  def mixin(mixin: VueConstructor[Vue]): Unit = js.native
  def nextTick(): js.Promise[Unit] = js.native
  def nextTick(callback: js.Function0[Unit]): Unit = js.native
  def nextTick(callback: js.Function0[Unit], context: js.Array[_]): Unit = js.native
  def set[T](array: js.Array[T], key: Double, value: T): T = js.native
  def set[T](`object`: js.Object, key: String, value: T): T = js.native
  def use(plugin: PluginFunction[_], options: js.Any*): Unit = js.native
  def use(plugin: PluginObject[_], options: js.Any*): Unit = js.native
  def use[T](plugin: PluginFunction[T]): Unit = js.native
  def use[T](plugin: PluginFunction[T], options: T): Unit = js.native
  def use[T](plugin: PluginObject[T]): Unit = js.native
  def use[T](plugin: PluginObject[T], options: T): Unit = js.native
}

