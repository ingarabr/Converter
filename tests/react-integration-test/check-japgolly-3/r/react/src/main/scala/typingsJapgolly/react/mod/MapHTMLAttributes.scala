package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var name: js.UndefOr[String] = js.undefined
}
object MapHTMLAttributes {
  
  inline def apply[F[_], T]()(implicit _sync: Sync[F]): MapHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapHTMLAttributes[T]]
  }
  
  extension [Self <: MapHTMLAttributes[?], T](x: Self & MapHTMLAttributes[T]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
