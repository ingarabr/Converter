package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefAttributes[T]
  extends StObject
     with Attributes {
  
  var ref: js.UndefOr[Ref[T]] = js.undefined
}
object RefAttributes {
  
  inline def apply[T](): RefAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefAttributes[T]]
  }
  
  extension [Self <: RefAttributes[?], T](x: Self & RefAttributes[T]) {
    
    inline def setRef(value: Ref[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1[F[_]](value: /* instance */ T | Null => F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ T | Null) => _sync.runSync(value(t0))))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
