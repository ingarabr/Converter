package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalajs.dom.raw.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEvent[T]
  extends StObject
     with BaseSyntheticEvent[NativeAnimationEvent, EventTarget & T, EventTarget] {
  
  var animationName: String
  
  var elapsedTime: Double
  
  var pseudoElement: String
}
object AnimationEvent {
  
  inline def apply[F[_], T](
    animationName: String,
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget & T,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: NativeAnimationEvent,
    persist: F[Unit],
    preventDefault: F[Unit],
    pseudoElement: String,
    stopPropagation: F[Unit],
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  )(
    implicit _sync: Sync[F]
  ): AnimationEvent[T] = {
    val __obj = js.Dynamic.literal(animationName = animationName.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = _sync.toJsFn(isDefaultPrevented), isPropagationStopped = _sync.toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = _sync.toJsFn(persist), preventDefault = _sync.toJsFn(preventDefault), pseudoElement = pseudoElement.asInstanceOf[js.Any], stopPropagation = _sync.toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent[T]]
  }
  
  extension [Self <: AnimationEvent[?], T](x: Self & AnimationEvent[T]) {
    
    inline def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setPseudoElement(value: String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
  }
}
