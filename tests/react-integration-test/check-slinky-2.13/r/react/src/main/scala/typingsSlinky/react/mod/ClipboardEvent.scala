package typingsSlinky.react.mod

import org.scalajs.dom.raw.DataTransfer
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipboardEvent[T]
  extends StObject
     with BaseSyntheticEvent[NativeClipboardEvent, EventTarget with T, EventTarget] {
  
  var clipboardData: DataTransfer
}
object ClipboardEvent {
  
  @scala.inline
  def apply[T](
    bubbles: Boolean,
    cancelable: Boolean,
    clipboardData: DataTransfer,
    currentTarget: EventTarget with T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: NativeClipboardEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): ClipboardEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clipboardData = clipboardData.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardEvent[T]]
  }
  
  @scala.inline
  implicit class ClipboardEventMutableBuilder[Self <: ClipboardEvent[_], T] (val x: Self with ClipboardEvent[T]) extends AnyVal {
    
    @scala.inline
    def setClipboardData(value: DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
  }
}
