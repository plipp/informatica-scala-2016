// Tutorial Bot #1: Hello World

class ControlFunction {

  // The only door to the EXTERNAL world:
  //
  // Callback function, which is always called, when anything in the world around changes.
  def respond(input: String) = {
    val tokens: Array[String] = "React(generation=0,time=0,view=__W_W_W__)".split('(')
    if (tokens(0)=="React") /* e.g. React(generation=0,time=0,view=__W_W_W__,energy=100) */ {
      val params: Array[String] = tokens(1).dropRight(1).split(',')
      val paramMap = params
        .map(_.split('='))
        .map(a => (a(0), a(1)))
        .toMap
      val energy: String = paramMap("energy")
      s"Move(direction=0:-1)|Status(text=$energy)"
    } else ""
  }
}

// ----------------------------------------------------------------------------------
// INTERNALS (you don't need to touch this during the workshop!)
//
// Entry Point for the Server
class ControlFunctionFactory {
  def create = new ControlFunction().respond _
}
