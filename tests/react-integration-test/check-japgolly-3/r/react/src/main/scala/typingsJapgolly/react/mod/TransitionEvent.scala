package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionEvent[T]
  extends StObject
     with BaseSyntheticEvent[NativeTransitionEvent, EventTarget & T, EventTarget] {
  
  var elapsedTime: Double
  
  var propertyName: String
  
  var pseudoElement: String
}
object TransitionEvent {
  
  inline def apply[F[_], T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: NativeTransitionEvent,
    persist: F[Unit],
    preventDefault: F[Unit],
    propertyName: String,
    pseudoElement: String,
    stopPropagation: F[Unit],
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  )(
    implicit _sync: Sync[F]
  ): TransitionEvent[T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = _sync.toJsFn(isDefaultPrevented), isPropagationStopped = _sync.toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = _sync.toJsFn(persist), preventDefault = _sync.toJsFn(preventDefault), propertyName = propertyName.asInstanceOf[js.Any], pseudoElement = pseudoElement.asInstanceOf[js.Any], stopPropagation = _sync.toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEvent[T]]
  }
  
  extension [Self <: TransitionEvent[?], T](x: Self & TransitionEvent[T]) {
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPseudoElement(value: String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
  }
}
