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


// 2. implement 'respond': It should return
// - "Status(text=onReact)" if the input state 'React'
// - "Status(text=${energy-2})" as string if the input state is 'Goodbye'
// - else: "Status(text=?)"
// try to solve with: 'split' and toXXX and dropRight
def respond(input:String) = "Status(text=?)"

respond("nothing") // expected: Status(text=?)
respond("React(...") // expected: Status(text=onReact)"
respond("Goodbye(energy=99)") // expected: Status(text=97)
