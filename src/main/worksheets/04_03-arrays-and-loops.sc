// loops in scala


val a = List(1,2,3,4)

// ----------------------------------------------------------------------
// foreach() with sideeffects
// (Int) => ???
def printInt(i:Int) = print(i)
a.foreach(printInt) // pass a method

val printInt2 = (i: Int) => print(i) // a lambda-expression
a.foreach(printInt2) // pass a lambda-expression

a.foreach((i:Int)=>print(i)) // use the lambda-expression directly - long form

a.foreach(i => print(i)) // use the lambda-expression directly - short form
a.foreach(print(_)) // use _ as parameter

// ----------------------------------------------------------------------
// map+flatMap without side effects
val duplicate = a.map(i => i*2)

// `map`translates to
//
// ArrayList result = new ArrayList()
// for (i;i<a.length;i++) {
//     int value=a[i]*2;
//     result.add(a[i]);
// }
// return result;


// (Int) => List[U]
val duplicate2 = a.flatMap(i => List(i*2))
duplicate(2)

val threePlus = a.map(i => i+3)
val threePlus2 = a.flatMap(i => List(i+3))

// ----------------------------------------------------------------------
// filter without side effects
a.filter(i => i%3==0)

// `map`translates to
//
// ArrayList result = new ArrayList()
// for (i;i<a.length;i++) {
//     if (a[i]%3==0) {
//         result.add(a[i]);
//     }
// }
