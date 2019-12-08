object _0007_ReverseInteger {
   def main(args: Array[String]): Unit = {
    println(reverse(1499309429))
  }

  def isRange(x: Int): Boolean = {
    x <=  2147483647 || x >= -2147483648
  }

  def reverse(x: Int): Int = {
    val numList: String =
      //Stringに合わせるため
      if(x == 0 ) 0.toString
      else{ x.toString.toList  match {
        case y     if(y.endsWith(("0")) && y.startsWith("-")) => ("-" +: y.init.drop((1)).reverse).mkString("")
        case zero  if((zero.endsWith("0")))                   => zero.init.reverse.mkString("")
        case minus if(minus.startsWith("-"))                  => ("-" +: minus.drop(1).reverse).mkString("")
        case x                                                => x.reverse.mkString("")
      }
    }
    if(isRange(numList.toInt)) numList.toInt
    else 0
  }
}
