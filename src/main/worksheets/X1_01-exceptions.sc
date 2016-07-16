// Error Handling the Java way
val command="React(generation=0,time=0,view=__W_W_W__,energy=100)"

val tokens: Array[String] = command.split('(')
val opCode = tokens(0)
val params = tokens(1)

// ----------- invalid input
val inValidCommand="React|generation=0,time=0,view=__W_W_W__,energy=100|"
val invalidTokens: Array[String] = inValidCommand.split('(')
val invalidOpCode = invalidTokens(0)

// TODO check, what happens
// invalidTokens(1)

// ----------- 'handle' an exception
val cmd = try {
  invalidTokens(1)
} catch {
  case e: ArrayIndexOutOfBoundsException => println(s"Internal error: $e")
    "UNKNOWN"
}

// ----------- throw an exception
// TODO check, what happens
// throw new IllegalStateException("Something is wrong here")

// EXERCISE X1-1
// catch the exception of the following statement and convert into an IllegalStateException
invalidTokens(1)