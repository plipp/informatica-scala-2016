# [Optional] Refactoring - extract Method

After Lecture 05 the [code](snippets/06-Bot-Before-Refactoring.scala) is quite cluttered: 
`ControlFunction#respond` does too much: Parsing the server-input and replying.

Too fix this, we will extract the parsing into its own method.

## Instructions (Demo)

1. Check the code of the BotTest
    - [Bot Test class](../../src/test/scala/BotTest05.scala)<br>
    and run it either in IntelliJ or on command line:
    - `sbt ~test`
2. Refactor your Bot code to use a map for the server input parameter:
    - starting point: Either your own code after lecture 05 or alternatively<br>
      [Bot.scala after lecture 05](snippets/06-Bot-Before-Refactoring.scala): You may copy it to [the actual Bot.scala file](../../src/main/scala/Bot.scala)
      
    1. Change your initial implementation of [the ControlFunction#respond-method](../../src/main/scala/Bot.scala),
       so that it has the following structure after the refactoring:

```scala           
  
    class ControlFunction {
      def respond(input: String) = {
        val (opCode: String, paramMap: Map[String, String]) = parse(input)
    
        if (opCode=="React") /* e.g. React(generation=0,time=0,view=__W_W_W__,energy=100) */ {
          val energy = paramMap("energy")
          s"Move(direction=0:-1)|Status(text=$energy)"
        } else ""
      }
    
      private def parse(input: String): (String, Map[String, String]) = {
        // extract opcode and parameters ... TODO
        (opCode, paramMap)
      }
    }  
```                    
    During your refactoring and when finished, check, that the tests still run and when finished, let your bot run through the arena.
