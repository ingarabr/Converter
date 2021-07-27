package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidEvent[T]
  extends StObject
     with BaseSyntheticEvent[Event, EventTarget & T, EventTarget] {
  
  @JSName("target")
  var target_InvalidEvent: EventTarget & T
}
object InvalidEvent {
  
  inline def apply[F[_], T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: Event,
    persist: F[Unit],
    preventDefault: F[Unit],
    stopPropagation: F[Unit],
    target: EventTarget & T,
    timeStamp: Double,
    `type`: String
  )(
    implicit _sync: Sync[F]
  ): InvalidEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = _sync.toJsFn(isDefaultPrevented), isPropagationStopped = _sync.toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = _sync.toJsFn(persist), preventDefault = _sync.toJsFn(preventDefault), stopPropagation = _sync.toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidEvent[T]]
  }
  
  extension [Self <: InvalidEvent[?], T](x: Self & InvalidEvent[T]) {
    
    inline def setTarget(value: EventTarget & T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
