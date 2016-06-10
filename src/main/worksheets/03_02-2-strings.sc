// -------- EXERCISES

// 1. Check http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.StringOps
//    Find for a) and b) each 2 solutions with 'take', 'takeRight', 'drop' and/or 'dropRight'
// a)
"Hello".takeRight(2) // =>lo
"Hello".drop(3) // =>lo
// b)
"Hello".take(2) // => 'He'
"Hello".dropRight(3) // => 'He'


// 2. implement 'respond': It should return
// - "Status(text=onReact)" if the input state 'React'
// - "Status(text=${energy-2})" as string if the input state is 'Goodbye'
// - else: "Status(text=?)"
// try to solve with: 'split' and toXXX and dropRight
def respond(input:String) = {
  val tokens: Array[String] = input.split('(')
  if (tokens(0) == "React") "Status(text=onReact)"
  else if (tokens(0) == "Goodbye") {
    val energyAsString: String = tokens(1).dropRight(1).split('=')(1)
    s"Status(text=${energyAsString.toInt-2})"
  } else "Status(text=?)"
}

respond("nothing") // expected: Status(text=?)
respond("React(...") // expected: Status(text=onReact)"
respond("Goodbye(energy=99)") // expected: Status(text=97)


