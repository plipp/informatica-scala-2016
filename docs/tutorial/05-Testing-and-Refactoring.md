# More Scala Concepts

Before we continue developing the bot, it's time to introduce a concept of professional software development:
- (automated) unit testing

We use ScalaTest to write unit-tests and by the way learn more about
- how to secure refactor the Bot-Class


## Instructions (Group Exercise)

1. Check the code of the BotTest, run it:
    - [Bot test](../../src/test/scala/concepts/TODOTest.scala)
    - `sbt ~test`
2. Refactor your Bot code:
    - starting point: [Bot.scala without maps](snippets/05-Bot-Before-Refactoring.scala)
      Copy its code into the actual [Bot.scala file](../../src/main/scala/Bot.scala)
    - Change your initial implementation of [the ControlFunction#respond-method](../../src/main/scala/Bot.scala) (see also [Instructions](./03-Understand-ControlFunction-Input.md)),
      so that it puts all parameters in a dictionary/map and fetches their values from there
      
[Go on](https://github.com/plipp/scalatron/blob/master/Scalatron/doc/markdown/Scalatron%20Tutorial.md#bot-5-creating-a-command-parser-function)