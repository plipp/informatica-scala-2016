class ControlFunction() {
  val name = "Scala"
  var count = 0
  def respond(input: String): String = {
    count = count+1
    s"Status(text=Hello $name $count)"
  }

  override def toString: String = s"{name:$name, counter:$count}"
}

val controlFunction = new ControlFunction()
controlFunction.respond("input")
controlFunction.respond("input")
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
//    Hint: toString (see http://docs.scala-lang.org/tutorials/tour/classes.html)