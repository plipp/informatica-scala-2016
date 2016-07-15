val a = 1
val b = 3

var sideEffectMax = 0

// the Java-Way with side-effects
if (a>b) sideEffectMax=a else sideEffectMax=b
sideEffectMax

// the scala way without side-effects
// resembles Java: a>b? a: b
val maxValue = if (a>b) a else b

// --
// in Scala if's are always expressions (returning a value)
val ifResult = if (a > b) {
  a + b
} else if (a == b) {
  b * 2
} else {
  a - b
}