import scala.util.Random

// ----------------- convert vice-versa
val anInt = 24345

anInt.toString
s"$anInt"

val asInt = "235".toInt

// TODO: Was ist, wenn wir keine Zahl haben?
// "aber".toInt

// TODO: oder wenn ein String ein Double und kein Int ist?
// val asInt2 = "234.5".toInt

// ----------------- operations on strings

val aConcatenatedString1 = anInt + ", " + anInt + ", " + anInt + " ..." // toString called implicitly
val aConcatenatedString2 = s"$anInt, $anInt, $anInt ..."

val aString: String = "Das ist ein String"
aString.length

val tokens: Array[String] = aString.split(' ')
tokens(0)
tokens(1)
// TODO Crash : tokens(10)

tokens(1)="hello"
tokens

// equals in scala ==
val equalsOp = 234.toString=="234"
val refEqualsOp = 234.toString eq "234"

// ------------------ Exercise
val randomValue = math.abs(Random.nextInt())
val input1 = s"Goodbye(energy=$randomValue)"
val input2 = "React(generation=0,time=0,view=__W_W_W__,energy=100)"

// respond should be
// - empty string "" if the input state 'React'
// - (energy-2) as string if the input state is 'Goodbye'
// - else "?"
// try to solve with: 'split' and toXXX
def respond(input:String) = "?"

respond("nothing")