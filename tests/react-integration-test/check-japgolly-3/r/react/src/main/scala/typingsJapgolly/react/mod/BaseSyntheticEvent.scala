package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Event System
// ----------------------------------------------------------------------
// TODO: change any to unknown when moving to TS v3
trait BaseSyntheticEvent[E, C, T] extends StObject {
  
  var bubbles: Boolean
  
  var cancelable: Boolean
  
  var currentTarget: C
  
  var defaultPrevented: Boolean
  
  var eventPhase: Double
  
  def isDefaultPrevented(): Boolean
  
  def isPropagationStopped(): Boolean
  
  var isTrusted: Boolean
  
  var nativeEvent: E
  
  def persist(): Unit
  
  def preventDefault(): Unit
  
  def stopPropagation(): Unit
  
  var target: T
  
  var timeStamp: Double
  
  var `type`: String
}
object BaseSyntheticEvent {
  
  inline def apply[F[_], E, C, T](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: C,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: F[Boolean],
    isPropagationStopped: F[Boolean],
    isTrusted: Boolean,
    nativeEvent: E,
    persist: F[Unit],
    preventDefault: F[Unit],
    stopPropagation: F[Unit],
    target: T,
    timeStamp: Double,
    `type`: String
  )(
    implicit _sync: Sync[F]
  ): BaseSyntheticEvent[E, C, T] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = _sync.toJsFn(isDefaultPrevented), isPropagationStopped = _sync.toJsFn(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = _sync.toJsFn(persist), preventDefault = _sync.toJsFn(preventDefault), stopPropagation = _sync.toJsFn(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSyntheticEvent[E, C, T]]
  }
  
  extension [Self <: BaseSyntheticEvent[?, ?, ?], E, C, T](x: Self & (BaseSyntheticEvent[E, C, T])) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: C): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultPrevented[F[_]](value: F[Boolean])(implicit _sync: Sync[F]): Self = StObject.set(x, "isDefaultPrevented", _sync.toJsFn(value))
    
    inline def setIsPropagationStopped[F[_]](value: F[Boolean])(implicit _sync: Sync[F]): Self = StObject.set(x, "isPropagationStopped", _sync.toJsFn(value))
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setNativeEvent(value: E): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setPersist[F[_]](value: F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "persist", _sync.toJsFn(value))
    
    inline def setPreventDefault[F[_]](value: F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "preventDefault", _sync.toJsFn(value))
    
    inline def setStopPropagation[F[_]](value: F[Unit])(implicit _sync: Sync[F]): Self = StObject.set(x, "stopPropagation", _sync.toJsFn(value))
    
    inline def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
