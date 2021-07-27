package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var form: js.UndefOr[String] = js.undefined
  
  var htmlFor: js.UndefOr[String] = js.undefined
}
object LabelHTMLAttributes {
  
  inline def apply[F[_], T]()(implicit _sync: Sync[F]): LabelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelHTMLAttributes[T]]
  }
  
  extension [Self <: LabelHTMLAttributes[?], T](x: Self & LabelHTMLAttributes[T]) {
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
  }
}
