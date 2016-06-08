// Change the respond method so that it returns
//    Hello Scala1
//    Hello Scala2
//    Hello Scala3 ...

class ControlFunction {
  val name = "Scala"
  var cnt = 1

  def respond(input: String): String = {
    val status = s"Status(text=Hello $name$cnt)"
    cnt += 1
    status
  }
}

class ControlFunctionFactory {
  def create = new ControlFunction().respond _
}

