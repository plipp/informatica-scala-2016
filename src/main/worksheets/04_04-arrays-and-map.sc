// Starting Point
val react = "React(generation=0,time=0,view=__W_W_W__,energy=100)"
val params: Array[String] = react.split('(')(1).dropRight(1).split(',')
params.toList // make it visible
params(0)

// iterate over the params and get (key,value)-tuples - the functional way

// a) map: without side-effect => a scala way
val keyValueArrays1: Array[Array[String]] = params.map(param => param.split('='))

// make it visible
keyValueArrays1.foreach(aa => println(aa.toList))

val keyValueTuples1: Array[(String, String)] = keyValueArrays1.map((a:Array[String]) => (a(0), a(1)))
keyValueTuples1.toList // make it visible
val paramMap1: Map[String, String] = keyValueTuples1.toMap
paramMap1("energy")

// ... all in one with placeholder
val paramMap1b = params.map(_.split('=')).map(a => (a(0), a(1))).toMap
paramMap1b("energy")
//paramMap1b("ABC")

// b) flatMap: without side-effect => a scala way
val keyValueArrays2: Array[Array[String]] = params.flatMap (param => Array(param.split('=')))
val keyValueTuples2: Array[(String, String)] = keyValueArrays2.flatMap(kv => Array((kv(0),kv(1))))
val paramMap2: Map[String, String] = keyValueTuples2.toMap

// ---- EXERCISE 04 - 3
val ints = List(1,2,3,4,5)

// see http://www.scala-lang.org/api/current/#scala.Array
// multiply all ints with 2, filter all multiples of 5, multiply with 7 using 'map' ..
val result = ints
  .map(i => i*2)
  .filter(i => i%5==0)
  .map(i=>7*i)
