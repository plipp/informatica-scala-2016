// Tutorial Bot Class

class ControlFunction {

  // The only door to the EXTERNAL world:
  //
  // Callback function, which is always called, when anything in the world around changes
  def respond(input: String) = {
    val tokens: Array[String] = input.split('(')
    if (tokens(0)=="React") /* e.g. React(generation=0,time=0,view=__W_W_W__,energy=100) */ {
      val params: Array[String] = tokens(1).dropRight(1).split(',')
      val paramMap = params
        .map(_.split('='))
        .map(a => (a(0), a(1)))
        .toMap

      val energy = paramMap("energy")
      val view = paramMap("view")
      val (x,y) = findPath(view)
      s"Move(direction=$x:$y)|Status(text=Hello$energy)"
    } else ""
  }

  private def findPath(view: String) = {
    val pathFinder = new PathFinder(new MyView(view))
    pathFinder.findPath()
  }

  private def parse(input: String): (String, Map[String, String]) = {
    val tokens: Array[String] = input.split('(')
    val opCode: String = tokens(0)

    val params: Array[String] = tokens(1).dropRight(1).split(',')
    val paramMap: Map[String, String] =
      params
        .map(param => param.split('='))
        .map(kv => (kv(0), kv(1))).toMap

    (opCode, paramMap)
  }
}

// NEW
// EXERCISE 2: Implement findPath, so that the Bot does not crash into a wall and does not stick at one place
class PathFinder (view: MyView) {
  /**
    * find a free cell (no 'M', no 'W' on it) in the neighborhood (x <- -1 to 1, y <- -1 to 1)
    *
    * @return the relative coordinates of the free cell, e.g. (-1,1)
    */
  def findPath():(Int, Int) = ???

}

// NEW
// EXERCISE 1: Implement toIndex, so that MyViewTest08 is green
class MyView (val view: String){
  val size = scala.math.sqrt(view.length).round.toInt
  val n = size/2

  require(size*size==view.length, s"length of view is not quadratic: ${view.length} != $size*$size")


  /**
    * return the character at the position x,y in my view.
    *
    * @param x the x-coordinate in my view
    * @param y the y-coordinate in my view
    * @return the character at the given position, an IndexOutOfBoundsException, if the position is outside my view
    */
  def at(x: Int, y:Int) = view.charAt(toIndex(x,y))

  private def toIndex(x: Int, y: Int): Int = (y+n)*size +(x+n)

  override def toString: String = {
    def toLines(rest:String): String =
      if (rest.isEmpty) ""
      else {
        val (line, remainingLines) = rest.splitAt(size)
        line + "\n" +toLines(remainingLines)
      }
    toLines(view)
  }
}

// ----------------------------------------------------------------------------------
// INTERNALS (you don't need to touch this during the workshop!)
//
// Entry Point for the Server

class ControlFunctionFactory {
  def create = new ControlFunction().respond _
}

