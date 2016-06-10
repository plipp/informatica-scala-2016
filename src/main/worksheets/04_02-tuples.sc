val iTuple2 = (1,2)
iTuple2._1
iTuple2._2
// TODO iTuple2._3


// the elements of a tuple can have diffent types ...
val aTuple3: (Char, Int, String) = ('a',1,"Abra")
aTuple3._1
aTuple3._2
aTuple3._3

//--- EXERCISE 04 - 1
// In 03_02-2-strings.sc we had
val s: String = "hello"

val left = s.dropRight(1)
val right = s.takeRight(1)

// which equals
s.take(4)
s.drop(4)

// be:
val result = (left, right)

// a) What is the type of 'result'? (let Idea Help You: ALT+ENTER)
// b) retrieve 'result' as one-liner with help of 'splitAt'
//    see http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.StringOps
// c) "Hello" -> "oHell" (via tuples)