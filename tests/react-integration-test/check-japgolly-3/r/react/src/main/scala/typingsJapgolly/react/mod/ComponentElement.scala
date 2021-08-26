package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */]
  extends StObject
     with ReactElement {
  
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}
object ComponentElement {
  
  inline def apply[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](props: js.Any, `type`: js.Any): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
  
  extension [Self <: ComponentElement[?, ?], P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](x: Self & (ComponentElement[P, T])) {
    
    inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1[F[_]](value: /* instance */ T | Null => F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ T | Null) => _sync.runSync(value(t0))))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
