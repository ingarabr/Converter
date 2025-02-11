package typingsJapgolly.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockquoteHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var cite: js.UndefOr[String] = js.undefined
}
object BlockquoteHTMLAttributes {
  
  @scala.inline
  def apply[T](): BlockquoteHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockquoteHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class BlockquoteHTMLAttributesMutableBuilder[Self <: BlockquoteHTMLAttributes[_], T] (val x: Self with BlockquoteHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
