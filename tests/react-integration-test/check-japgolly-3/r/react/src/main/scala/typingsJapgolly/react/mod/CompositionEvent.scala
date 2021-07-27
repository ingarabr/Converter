package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositionEvent[T]
  extends StObject
     with BaseSyntheticEvent[NativeCompositionEvent, EventTarget & T, EventTarget] {
  
  var data: String
}
object CompositionEvent {
  
  inline def apply[F[_], T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & T,
    data: String,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: NativeCompositionEvent,
    persist: F[Unit],
    preventDefault: F[Unit],
    stopPropagation: F[Unit],
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  )(
    implicit _sync: Sync[F]
  ): CompositionEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = _sync.toJsFn(isDefaultPrevented), isPropagationStopped = _sync.toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = _sync.toJsFn(persist), preventDefault = _sync.toJsFn(preventDefault), stopPropagation = _sync.toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionEvent[T]]
  }
  
  extension [Self <: CompositionEvent[?], T](x: Self & CompositionEvent[T]) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
