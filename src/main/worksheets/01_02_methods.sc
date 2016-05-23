def respond(input: String) = "Status(text=Hello)"
respond("World")

def respondFullSignature(input: String): String = "Status(text=Hello)"
respondFullSignature("World")

def respondDoingMore(input: String): String = {
  val i = 55*2
  "Status(text="+i+")"
}
respondDoingMore("World")

def doNotReturn(input: String): String = {
  val i = 55*2
  return "Status(text="+i+")"
}
doNotReturn("World")

def respondDoNotForgetEquals(input: String) {
  val i = 55*2
  "Status(text="+i+")"
}
// TODO respondDoNotForgetEquals("World")

// EXERCISE 02
// Change the respond method, so that
//      respond("World")
// returns "Status(text=Hello World)"