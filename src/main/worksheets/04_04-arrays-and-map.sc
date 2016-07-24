// Starting Point
val react = "React(generation=0,time=0,view=__W_W_W__,energy=100)"
val params: Array[String] = react.split('(')(1).dropRight(1).split(',')
params.toList // make it visible

// iterate over the params and get (key,value)-tuples - the functional way

// a) map: without side-effect => a scala way
val keyValueArrays1: Array[Array[String]] = params.map(param => param.split('='))

// make it visible
keyValueArrays1.foreach(aa => println(aa.toList))

val keyValueTuples1: Array[(String, String)] = keyValueArrays1.map(a => (a(0), a(1)))
keyValueTuples1.toList // make it visible
val paramMap1: Map[String, String] = keyValueTuples1.toMap

// ... all in one with placeholder
val paramMap1b = params.map(_.split('=')).map(a => (a(0), a(1))).toMap

// b) flatMap: without side-effect => a scala way
val keyValueArrays2: Array[Array[String]] = params.flatMap (param => Array(param.split('=')))
val keyValueTuples2: Array[(String, String)] = keyValueArrays2.flatMap(kv => Array((kv(0),kv(1))))
val paramMap2: Map[String, String] = keyValueTuples2.toMap

// ---- EXERCISE 04 - 3

val ints = Array(1,2,3)

// see http://www.scala-lang.org/api/current/#scala.Array
// a) multiply all ints with 2 using 'map' -> Array(2,4,6)
// b) multiply all ints with 2 using 'flatMap' -> Array(2,4,6)
// TODO
//val multipliedWith2ByMap =
//val multipliedWith2ByFlatMap =
