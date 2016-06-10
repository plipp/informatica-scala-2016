// Sample: We want all possible triples

// Note: A List is like an Array, but you can't update the single elements => immutable
val l1 = List(1,2,3)
val l2 = List(10,20,30)
val l3 = List(100,200,300)

// expected solution: List((1,10,100),(1,10,200),...(1,20,100)...,(3,30,300))
// a) with (flat)Map
l3.map(t3 => (0,0,t3))


// TODO derive
//l2.map(t2 => l3.map(t3 => (0,t2,t3)))
//l2.flatMap(t2 => l3.map(t3 => (0,t2,t3)))
//
//l1.map(t1 => l2.flatMap(t2 => l3.map(t3 => (t1,t2,t3))))
//l1.flatMap(t1 => l2.flatMap(t2 => l3.map(t3 => (t1,t2,t3))))
//
//l1.flatMap(t1 => l2.flatMap(t2 => l3.flatMap(t3 => List((t1,t2,t3)))))

// b) with for-comprehension
//for {t1 <- l1
//     t2 <- l2
//     t3 <- l3} yield (t1,t2,t3)