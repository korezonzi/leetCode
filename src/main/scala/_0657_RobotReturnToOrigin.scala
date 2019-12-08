object _0657_RobotReturnToOrigin {
  def main(args: Array[String]): Unit = {
    println(judgeCircle("UD"))
  }

  def judgeCircle(moves: String): Boolean = {
    //moves.toListだとList[Char]になるため
    val movesList:  List[String] = moves.toList.map(x => x.toString)
    val vertical:   List[Int]    = movesList.collect { case "U" => 1; case "D" => -1 }
    val horizontal: List[Int]    = movesList.collect { case "R" => 1; case "L" => -1 }
    (vertical, horizontal) match {
      //水平方向, 垂直方向でそれぞれ0になるか
      case (x, y) if(x.sum == 0 && y.sum == 0) => true
      case _                                   => false
    }
  }
}