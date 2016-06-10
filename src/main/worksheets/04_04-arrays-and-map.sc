// ---- EXERCISE 04 - 3

val ints = Array(1,2,3)

// see http://www.scala-lang.org/api/current/#scala.Array
// a) multiply all ints with 2 using 'map' -> Array(2,4,6)
// b) multiply all ints with 2 using 'flatMap' -> Array(2,4,6)

val multipliedWith2ByMap = ints map(2*_)
val multipliedWith2ByFlatMap = ints flatMap(i => Array(2*i))
