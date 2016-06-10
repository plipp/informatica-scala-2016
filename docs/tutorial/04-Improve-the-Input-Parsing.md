# Improve the Input Parsing

## Motivation
The current implementation of `respond(input: String)`:

     def respond(input: String) = {
         val tokens: Array[String] = input.split('(')
         if (tokens(0)=="React") /* e.g. React(generation=0,time=0,view=__W_W_W__,energy=100) */ {
             val params: Array[String] = tokens(1).dropRight(1).split(',')
             val energy: String = params(3).split('=')(1)
             s"Move(direction=0:-1)|Status(text=$energy)"
         } else ""
     }

is not very robust, as it expects an input String for the State 'React' in exactly the following form 
"React(generation=0,time=0,view=__W_W_W__,energy=100)", 
which doesn't take into consideration, that empty/unset parameters can be omitted. According this rule the implementation should be able
to handle e.g. "React(generation=0,view=__W_W_W__,energy=100)" as well, where 'time' is not set.

A convenient way for the realization would be to store the parameters in a Dictionary/Map and to fetch them from there, e.g.:

      parameters("energy") // returns "100"

## Instructions

1. Work through the worksheets
    - [maps](../../src/main/worksheets/04_01-basic-maps.sc)
    - [tuples](../../src/main/worksheets/04_02-tuples.sc)
    - [arrays and loops](../../src/main/worksheets/04_03-arrays-and-loops.sc)
    - [arrays and map/flatMap](../../src/main/worksheets/04_04-arrays-and-map.sc)

2. Improve your Bot code:
    - Change your initial implementation of [the ControlFunction#respond-method](../../src/main/scala/Bot.scala) (see also [Instructions](./03-Understand-ControlFunction-Input.md)),
      so that it puts all parameters in a dictionary/map and fetches their values from there