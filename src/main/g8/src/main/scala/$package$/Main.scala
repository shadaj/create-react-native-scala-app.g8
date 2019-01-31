package $package$

import scala.scalajs.js
import scala.scalajs.LinkingInfo
import scala.scalajs.js.annotation.{JSExportTopLevel, JSImport}

import slinky.native.AppRegistry
import slinky.hot

object Main {
  @JSExportTopLevel("main")
  def main(): Unit = {
    if (LinkingInfo.developmentMode) {
      hot.initialize()
      App.componentConstructor // required to force proxy update
    }
    
    AppRegistry.registerComponent("$name$", () => {
      App
    })
  }
}
