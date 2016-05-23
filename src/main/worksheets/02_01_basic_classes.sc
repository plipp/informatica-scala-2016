class ControlFunction {
  val name = "Scala"
  def respond(input: String) = {
    s"Status(text=Hello $name)"
  }
}

val controlFunction = new ControlFunction()
controlFunction.respond("input")

// EXERCISE 03
// TODO lets count