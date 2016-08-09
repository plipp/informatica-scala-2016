// Motivation: remove the last char of a string

// a) the Java-Way
val s: String = "hello"
s.substring(0,s.length-1)

val sEmpty = ""
// TODO What happens here???
// sEmpty.substring(0, sEmpty.length-1)
// ------------------ Exercise

//// b) the Scala-Way
s.dropRight(1)
//// TODO What happens here???
// sEmpty.dropRight(1)
//
//// -------- EXERCISES
//
// 1. Check http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.StringOps
//    Find for a) and b) each 2 solutions with 'take', 'takeRight', 'drop' and/or 'dropRight'
// a)
"Hello".takeRight(2) // =>lo
"Hello".drop(3) // =>lo

// b)
"Hello".dropRight(3) // => 'He'
"Hello".take(2) // => 'He'

// 2 extract the energy value (99) as integer from the following token1-String
val inp = "Goodbye(energy=99)"

val inp2: String = inp.split('(').toList(1).dropRight(1)
inp2.split('=').toList(1).toInt

val token1="energy=99)" // --> 99:Int

// 3. implement 'respond': It should return
// - "Status(text=onReact)" if the input state 'React'
// - "Status(text=${energy-2})" as string if the input state is 'Goodbye'
// - else: "Status(text=?)"
// try to solve with: 'split' and toXXX and dropRight
def respond(input:String): String = {
  val tokens = input.split("\\(")
  val event = if (tokens(0)=="React") {
    "onReact"
  } else if (tokens(0)=="Goodbye"){
    val energy = token1.dropRight(1).split('=').toList(1).toInt
    energy-2
  } else {
    "?"
  }
  s"Status(text=$event)"
}

respond("nothing") // expected: Status(text=?)
respond("React(...") // expected: Status(text=onReact)"
respond("Goodbye(energy=99)") // expected: Status(text=97)

// Optional:
// 4. Instead of an if-statement a match can be used, which is ressembles a
//    switch in java/js.
//    See http://docs.scala-lang.org/tutorials/tour/pattern-matching.html for how it works.
//    Implement 3 with pattern-matching.