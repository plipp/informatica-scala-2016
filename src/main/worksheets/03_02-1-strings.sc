// respond should return
// - "Status(text=onReact)" if the input state 'React'
// - "Status(text=onGoodbye)" if the input state is 'Goodbye'
// - else "Status(text=?)"
// try to solve with: 'split' and toXXX
def respond(input:String) = {
  val tokens: Array[String] = input.split('(')
  if (tokens(0)=="React") "Status(text=onReact)"
  else if (tokens(0)=="Goodbye") "Status(text=onGoodbye)"
  else "Status(text=?)"
}

respond("nothing") // expected: Status(text=?)
respond("React(...") // expected: Status(text=onReact)
respond("Goodbye(energy=99)") // expected: Status(text=onGoodbye)