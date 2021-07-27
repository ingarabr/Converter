package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply[F[_], T]()(implicit _sync: Sync[F]): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  extension [Self <: DetailsHTMLAttributes[?], T](x: Self & DetailsHTMLAttributes[T]) {
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
