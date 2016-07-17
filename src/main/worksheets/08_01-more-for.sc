// --- for expression (see also 04-03-arrays-and-loops)
val res1 = for (i <- 1 to 10) print(i) // Unit with sideeffects

val res2 = for (i <-1 to 10) yield i   // Vector

// --- for comprehensions
val combined1 = for {
  i <- 1 to 3
  j <- 10 to 13
} yield i+j

val combined2 = for {
  i <- 1 to 3
  j <- 10 to 13
} yield (i,j)

// filtered
val combinedWithGuard = for {
  i <- 1 to 3
  j <- 10 to 13 if (i+j)%2 == 0
} yield (i,j)

// TODO EXERCISE 1
def at(x: Int, y:Int) = if ((x+y)%2==0) 'W' else '_'

// find all (x,y)-Tuples for x <- -1 to 1, y <- -1 to 1, where at(x,y)!='W'
// expected result: Vector((-1,0), (0,-1), (0,1), (1,0))
for {
  x <- -1 to 1
  y <- -1 to 1 if at(x,y)!='W'
} yield (x,y)