// Tutorial Bot Class
class ControlFunction {
  // The only door to the EXTERNAL world:
  //
  // Callback function, which is always called, when anything in the world around changes.
  def respond(input: String) = {
    val (opCode: String, paramMap: Map[String, String]) = parse(input)

    if (opCode=="React") /* e.g. React(generation=0,time=0,view=__W_W_W__,energy=100) */ {
      val energy = paramMap("energy")
      s"Move(direction=0:-1)|Status(text=$energy)"
    } else ""
  }

  private def parse(input: String): (String, Map[String, String]) = {
    val tokens: Array[String] = input.split('(')
    val opCode: String = tokens(0)

    val params: Array[String] = tokens(1).dropRight(1).split(',')
    val paramMap: Map[String, String] =
      params
        .map(param => param.split('='))
        .map(kv => (kv(0), kv(1))).toMap

    (opCode, paramMap)
  }
}

class ControlFunctionFactory {
  def create = new ControlFunction().respond _
}
