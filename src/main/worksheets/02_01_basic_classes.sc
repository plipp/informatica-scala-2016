class ControlFunction() {
  val name = "Scala"
  var cnt=0
  def respond(input: String): String = {
    cnt += 1
    s"Status(text=Hello $name$cnt)"
  }

  override def toString: String = s"{name:'$name', counter:$cnt}"
}

val controlFunction = new ControlFunction()
controlFunction.respond("input")
controlFunction.respond("input")
controlFunction.respond("input")

// EXERCISE 03
// a) Change the respond method so that it returns
//    Hello Scala1
//    Hello Scala2
//    Hello Scala3 ...
// b) Change the ControlFunction class, so that
println(controlFunction)
//    returns the values of the controlFunctions members
//    e.g. {name:'Scala', counter:5}