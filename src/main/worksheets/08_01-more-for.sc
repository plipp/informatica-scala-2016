// --- for expression (see also 04-03-arrays-and-loops)
val result1 = for (i <- 1 to 10) print(i) // Unit with sideeffects

val result2 = for (i <-1 to 10) yield 2*i   // Vector

val result22 = (1.to(10)).map(i=>i*2)
//
//// --- for comprehensions
val combined1 = for {
  i <- 1 to 3
  j <- 10 to 13
} yield i+j
//
val combined2 = for {
  i <- 1 to 3
  j <- 10 to 13
} yield (i,j)
//
//// filtered
val combinedWithGuard = for {
  i <- 1 to 3
  j <- 10 to 13 if (i+j)%2 == 0
} yield (i,j)
//
// TODO EXERCISE 1
// find all (x,y)-Tuples for x <- -1 to 1, y <- -1 to 1
for {
  i <- -1 to 1
  j <- -1 to 1
} yield (i,j)

def at(x: Int, y:Int) = if ((x+y)%2==0) 'W' else '_'

// find all (x,y)-Tuples for x <- -1 to 1, y <- -1 to 1, where at(x,y)!='W' and !='M'
// expected result: Vector((-1,0), (0,-1), (0,1), (1,0))
for {
  x <- -1 to 1
  y <- -1 to 1 if at(x,y)!='W' && at(x,y)!='M'
} yield (x,y)
