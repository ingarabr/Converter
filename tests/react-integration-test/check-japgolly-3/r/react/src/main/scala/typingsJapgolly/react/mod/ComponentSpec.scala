package typingsJapgolly.react.mod

import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSpec[P, S]
  extends StObject
     with Mixin[P, S]
     with /* propertyName */ StringDictionary[js.Any] {
  
  def render(): Node
}
object ComponentSpec {
  
  inline def apply[F[_], P, S](render: F[Node])(implicit _sync: Sync[F]): ComponentSpec[P, S] = {
    val __obj = js.Dynamic.literal(render = _sync.toJsFn(render))
    __obj.asInstanceOf[ComponentSpec[P, S]]
  }
  
  extension [Self <: ComponentSpec[?, ?], P, S](x: Self & (ComponentSpec[P, S])) {
    
    inline def setRender[F[_]](value: F[Node])(implicit _sync: Sync[F]): Self = StObject.set(x, "render", _sync.toJsFn(value))
  }
}
