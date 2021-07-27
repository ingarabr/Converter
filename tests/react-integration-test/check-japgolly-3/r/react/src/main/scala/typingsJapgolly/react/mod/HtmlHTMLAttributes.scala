package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var manifest: js.UndefOr[String] = js.undefined
}
object HtmlHTMLAttributes {
  
  inline def apply[F[_], T]()(implicit _sync: Sync[F]): HtmlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlHTMLAttributes[T]]
  }
  
  extension [Self <: HtmlHTMLAttributes[?], T](x: Self & HtmlHTMLAttributes[T]) {
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
  }
}
