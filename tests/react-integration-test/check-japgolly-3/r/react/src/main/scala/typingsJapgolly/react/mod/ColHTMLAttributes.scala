package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var span: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ColHTMLAttributes {
  
  inline def apply[F[_], T]()(implicit _sync: Sync[F]): ColHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColHTMLAttributes[T]]
  }
  
  extension [Self <: ColHTMLAttributes[?], T](x: Self & ColHTMLAttributes[T]) {
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
