// use this to test out your ideas
val react: String = "React(generation=0,time=0,view=__W_W_W__,energy=100)"
val tokens = react.split('(')
val params: Array[String] = tokens(1).dropRight(1).split(',')
params(3).split('=')(1)