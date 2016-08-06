import scala.util.{Random, Try}

// Now the Scala Way

// ----------- invalid input
val inValidCommand="React|generation=0,time=0,view=__W_W_W__,energy=100|"
val invalidTokens: Array[String] = inValidCommand.split('(')
val invalidOpCode = invalidTokens(0)

// TODO check, what happens
// invalidTokens(1)

// ----------- 'handle' an exception
// as seen before - the Java way
val cmd = try {
  invalidTokens(1)
} catch {
  case e: ArrayIndexOutOfBoundsException => println(s"Internal error: $e")
    "UNKNOWN"
}

// ... the Scala way
val mayBeParams = Try{invalidTokens(1)}
mayBeParams

// TODO what happens
// mayBeParams.get
val params1 = mayBeParams.getOrElse("UNKNOWN")

// ------------ EXERCISE X1-2

val i = Random.nextInt()%2

// the following line can fail with a java.lang.ArithmeticException: / by zero
// In case of an exception, return -1 as result.
// Use Try - getOrElse
val result = 100/i
