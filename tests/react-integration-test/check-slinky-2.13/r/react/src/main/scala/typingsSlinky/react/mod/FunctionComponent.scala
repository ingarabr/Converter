package typingsSlinky.react.mod

import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponent[P] extends StObject {
  
  def apply(props: PropsWithChildren[P]): slinky.core.facade.ReactElement | Null = js.native
  def apply(props: PropsWithChildren[P], context: js.Any): slinky.core.facade.ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
}
