// Tutorial Bot Class

class ControlFunction {

    // The only door to the EXTERNAL world:
    //
    // Callback function, which is always called, when anything in the world around changes.
    def respond(input: String): String = "Status(text=Hello)"
}


// ----------------------------------------------------------------------------------
// INTERNALS (you don't need to touch this during the workshop!)
//
// Entry Point for the Server
class ControlFunctionFactory {
    def create = new ControlFunction().respond _
}

