package $package$

import slinky.core._
import slinky.core.annotations.react

import slinky.native._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@react class App extends Component {
  type Props = Unit
  type State = Int

  def initialState = 0

  def render() = {
    View(
      style = literal(padding = 50)
    )(
      Text(
        style = literal(fontSize = 30, color = "red")
      )("Hello, Slinky!"),
      Text("Count: " + state),
      Button(title = "Press me", onPress = () => {
        setState(_ + 1)
      }),
      Image(source = ImageURISource(
        uri = "https://facebook.github.io/react-native/docs/assets/favicon.png"
      ), style = literal(
        width = 50,
        height = 50
      ))
    )
  }
}
