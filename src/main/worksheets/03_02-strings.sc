import scala.util.Random

// ------------------ Exercise
val randomValue = math.abs(Random.nextInt())
val input1 = s"Goodbye(energy=$randomValue)"
val input2 = "React(generation=0,time=0,view=__W_W_W__,energy=100)"

// respond should be
// - empty string "" if the input state 'React'
// - (energy-2) as string if the input state is 'Goodbye'
// - else "?"
// try to solve with: 'split' and toXXX
def respond(input:String) = {
  val tokens: Array[String] = input.split('(')
  if (tokens(0) == "React") ""
  else if (tokens(0) == "Goodbye") {
    val energyAsString: String = tokens(1).dropRight(1).split('=')(1)
    (energyAsString.toInt-2).toString
  } else "?"
}

respond("nothing")
respond("React(...")
respond("Goodbye(energy=99)")