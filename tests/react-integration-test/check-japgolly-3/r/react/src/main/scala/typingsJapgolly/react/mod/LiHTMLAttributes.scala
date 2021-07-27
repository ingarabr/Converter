package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}
object LiHTMLAttributes {
  
  inline def apply[F[_], T]()(implicit _sync: Sync[F]): LiHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiHTMLAttributes[T]]
  }
  
  extension [Self <: LiHTMLAttributes[?], T](x: Self & LiHTMLAttributes[T]) {
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
