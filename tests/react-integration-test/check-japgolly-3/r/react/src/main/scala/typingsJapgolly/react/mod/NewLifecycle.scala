package typingsJapgolly.react.mod

import japgolly.scalajs.react.util.Effect.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This should be "infer SS" but can't use it yet
trait NewLifecycle[P, S, SS] extends StObject {
  
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS], Unit]
  ] = js.undefined
  
  /**
    * Runs before React applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ P, /* prevState */ S, SS | Null]] = js.undefined
}
object NewLifecycle {
  
  inline def apply[F[_], P, S, SS]()(implicit _sync: Sync[F]): NewLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewLifecycle[P, S, SS]]
  }
  
  extension [Self <: NewLifecycle[?, ?, ?], P, S, SS](x: Self & (NewLifecycle[P, S, SS])) {
    
    inline def setComponentDidUpdate[F[_]](
      value: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => F[Unit]
    )(
      implicit _sync: Sync[F]
    ): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction3((t0: /* prevProps */ P, t1: /* prevState */ S, t2: /* snapshot */ js.UndefOr[SS]) => _sync.runSync(value(t0, t1, t2))))
    
    inline def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
    
    inline def setGetSnapshotBeforeUpdate(value: (/* prevProps */ P, /* prevState */ S) => SS | Null): Self = StObject.set(x, "getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    inline def setGetSnapshotBeforeUpdateUndefined: Self = StObject.set(x, "getSnapshotBeforeUpdate", js.undefined)
  }
}
