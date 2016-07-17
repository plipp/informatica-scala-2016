# Error Handling

In case of server-input in an unexpected format, we get quite weird error messages.
This lecture shows, how Exceptions/Errors can be handled.

## Instructions

1. Damage the Bot, e.g. set the server-input for parsing to "" and check what happens in the arena.
   
   Starting point: Either your own code after lecture 06 or alternatively<br>
   [07-Bot-with-Damage.scala](snippets/07-Bot-with-Damage.scala): You may copy it to [the actual Bot.scala file](../../src/main/scala/Bot.scala)

   Check both the board and the server logs: What happens?
   
2. Work through the worksheets
    - [exceptions](../../src/main/worksheets/07_01-exceptions.sc)
    - [Try](../../src/main/worksheets/07_02-Try.sc)
                 
3. In `ControlFunction#respond`: 
    - catch the Exception, thrown by calling `parse`, 
    - print a stacktrace and use `("Unknown", Map.empty)` as `(opCode: String, paramMap: Map[String, String])`, so that
      `respond` replies with an empty String.
    - Check both the board and the server logs: What happens now?