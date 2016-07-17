# Find a Path

Lets make our bot more intelligent: It shouldn't run into a wall any more and it should always be in motion.

## Instructions

1. Starting point:
   [08-Bot-Starter.scala](snippets/08-Bot-Starter.scala): You may want to copy it to [the actual Bot.scala file](../../src/main/scala/Bot.scala)

2. Decomment the Tests in (MyViewTest08)[../../src/test/scala/MyViewTest08.scala]
   Implement [Bot.scala: MyView#toIndex](../../src/main/scala/Bot.scala), so that the tests are green
   
3. Work through the worksheets
    - [more-for](../../src/main/worksheets/08_01-more-for.sc)
    - [for-comprehensions](../../src/main/worksheets/08_01-for-comprehensions.sc)
                 
4. Implement [Bot.scala: PathFinder#findPath](../../src/main/scala/Bot.scala), so that the bot does not crash in a wall
   'W' and is always in motion.

5. Check, that the tests still work. If necessary adapt them.