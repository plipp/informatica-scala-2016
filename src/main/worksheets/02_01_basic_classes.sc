class ControlFunction() {
  val name = "Scala"
  def respond(input: String): String = {
    s"Status(text=Hello $name)"
  }
}

val controlFunction = new ControlFunction()
controlFunction.respond("input")

// EXERCISE 02
// a) Change the respond method so that it returns
//    Hello Scala1
//    Hello Scala2
//    Hello Scala3 ...
// b) Change the ControlFunction class, so that
println(controlFunction)
//    returns the values of the controlFunctions members
//    e.g. {name:'Scala', counter:5}