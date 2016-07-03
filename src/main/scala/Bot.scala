// # Get Your First Bot Running
//
// 1. Open [the Bot Code File](../../src/main/scala/Bot.scala)
// 2. Deploy it on the Gameboard as described in the [Bot-Development readme](../bot-development/readme.md)
// 3. Change the response of the `ControlFunction` to "Hello World". Press 'r' on the board.
//    Check on the gameboard, that the response text in fact changed.
class ControlFunction {

    // The only door to the EXTERNAL world:
    //
    // Callback function, which is always called, when anything in the world around changes.
    def respond(input: String): String = "Status(text=Hello World)"
}


// ----------------------------------------------------------------------------------
// INTERNALS (you don't need to touch this during the workshop!)
//
// Entry Point for the Server
class ControlFunctionFactory {
    def create = new ControlFunction().respond _
}

