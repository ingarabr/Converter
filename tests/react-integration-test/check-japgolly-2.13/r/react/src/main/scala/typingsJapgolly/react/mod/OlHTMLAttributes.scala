package typingsJapgolly.react.mod

import typingsJapgolly.react.reactStrings.A
import typingsJapgolly.react.reactStrings.I
import typingsJapgolly.react.reactStrings.`1`
import typingsJapgolly.react.reactStrings.a_
import typingsJapgolly.react.reactStrings.i_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[`1` | a_ | A | i_ | I] = js.undefined
}
object OlHTMLAttributes {
  
  @scala.inline
  def apply[T](): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class OlHTMLAttributesMutableBuilder[Self <: OlHTMLAttributes[_], T] (val x: Self with OlHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: `1` | a_ | A | i_ | I): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
