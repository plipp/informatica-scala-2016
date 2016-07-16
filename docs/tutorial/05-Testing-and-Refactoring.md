# Testing and Refactoring

Before we continue developing the bot, it's time to introduce a concept of professional software development:

- (automated) unit testing

We use ScalaTest to write unit-tests and learn how to safely refactor the Bot-Class


## Instructions (Group Exercise)

1. Check the code of the BotTest
    - [Bot Test class](../../src/test/scala/BotTest05.scala)<br>
    and run it either in IntelliJ or on command line:
    - `sbt ~test`
2. Refactor your Bot code to use a map for the server input parameter:
    - starting point: Either your own code after Lecture 04 or alternatively<br>
      [Bot.scala without maps](snippets/05-Bot-Before-Refactoring.scala): You may copy it to [the actual Bot.scala file](../../src/main/scala/Bot.scala)
      
    1. Change your initial implementation of [the ControlFunction#respond-method](../../src/main/scala/Bot.scala),
      so that it puts all parameters in a dictionary/map and fetches their values from there
    2. During your refactoring and when finished, check, that the tests still run.
    3. When finished, let your bot run through the arena.
