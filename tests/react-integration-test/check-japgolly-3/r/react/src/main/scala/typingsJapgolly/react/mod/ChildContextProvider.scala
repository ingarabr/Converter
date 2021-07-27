package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildContextProvider[CC] extends StObject {
  
  def getChildContext(): CC
}
object ChildContextProvider {
  
  inline def apply[F[_], CC](getChildContext: F[CC])(implicit _sync: Sync[F]): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = _sync.toJsFn(getChildContext))
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
  
  extension [Self <: ChildContextProvider[?], CC](x: Self & ChildContextProvider[CC]) {
    
    inline def setGetChildContext[F[_]](value: F[CC])(implicit _sync: Sync[F]): Self = StObject.set(x, "getChildContext", _sync.toJsFn(value))
  }
}
