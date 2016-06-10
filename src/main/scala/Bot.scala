//2. Improve your Bot code:
//  - Change your initial implementation of the ControlFunction#respond-method],
//    so that it puts all parameters in a dictionary/map and fetches their values from there

class ControlFunction {
    def respond(input: String) = {
        val tokens: Array[String] = input.split('(')
        if (tokens(0)=="React") /* e.g. React(generation=0,time=0,view=__W_W_W__,energy=100) */ {
            val params: Array[String] = tokens(1).dropRight(1).split(',')
            val paramMap: Map[String, String] = params.map(param => param.split('=')).map(kv=>(kv(0),kv(1))).toMap
            val energy = paramMap("energy")
            s"Move(direction=0:-1)|Status(text=$energy)"
        } else "Status(text=kkkk)"
    }
}

class ControlFunctionFactory {
    def create = new ControlFunction().respond _
}

