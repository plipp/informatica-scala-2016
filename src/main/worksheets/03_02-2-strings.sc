// Motivation: remove the last char of a string

// a) the Java-Way
val s: String = "hello"
s.substring(0,s.length-1)

val sEmpty = ""
// What happens here? TODO
// sEmpty.substring(0, sEmpty.length-1)
// ------------------ Exercise

// b) the Scala-Way
s.dropRight(1)
// What happens here? TODO
//sEmpty.dropRight(1)

// -------- Exercises

// 1. Check http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.StringOps
//    Find for a) and b) each 2 solutions with 'take', 'takeRight', 'drop' and/or 'dropRight'
// a)
"Hello" // =>lo
// b)
"Hello" // => 'He'


// 2. implement 'respond': It should return
// - "Status(text=onReact)" if the input state 'React'
// - "Status(text=${energy-2})" as string if the input state is 'Goodbye'
// - else: "Status(text=?)"
// try to solve with: 'split' and toXXX and dropRight
def respond(input:String) = "Status(text=?)"

respond("nothing") // expected: Status(text=?)
respond("React(...") // expected: Status(text=onReact)"
respond("Goodbye(energy=99)") // expected: Status(text=97)

