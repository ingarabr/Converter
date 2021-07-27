package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DialogHTMLAttributes {
  
  inline def apply[F[_], T]()(implicit _sync: Sync[F]): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  extension [Self <: DialogHTMLAttributes[?], T](x: Self & DialogHTMLAttributes[T]) {
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
