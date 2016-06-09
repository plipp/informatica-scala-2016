//2. Enhance your Bot
//  - In case of a 'React' as input state let your Bot move 1 UP and update the status with your energy, e.g.: 'Status(text="50")'
//  - If there is no 'React'-input, but anything else: return ""

class ControlFunction {
    def respond(input: String) = {
        val tokens: Array[String] = input.split('(')
        if (tokens(0)=="React") /* e.g. React(generation=0,time=0,view=__W_W_W__,energy=100) */ {
            val params: Array[String] = tokens(1).dropRight(1).split(',')
            val energy: String = params(3).split('=')(1)
            s"Move(direction=0:-1)|Status(text=$energy)"
        } else ""
    }
}

class ControlFunctionFactory {
    def create = new ControlFunction().respond _
}

