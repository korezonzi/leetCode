//Accepted
//Memory Usage: 42.3 MB Runtime: 240 ms

object _0007_ReverseInteger {
   def main(args: Array[String]): Unit = {
     println(reverse(1534236469))
     println(reverse(15336469))
     println(reverse(-15336469))
     println(reverse(-153364690))
  }

  def reverse(x: Int): Int = {
    val numList: String =
      //Stringに合わせるため
      if(x == 0 ) 0.toString
      else{ x.toString.toList  match {
        case y     if(y.endsWith(("0")) && y.startsWith("-")) => ("-" +: y.init.tail.reverse).mkString("")
        case zero  if((zero.endsWith("0")))                   => zero.init.reverse.mkString("")
        case minus if(minus.startsWith("-"))                  => ("-" +: minus.drop(1).reverse).mkString("")
        case x                                                => x.reverse.mkString("")
      }
    }
    if(isRange(numList.toLong)) numList.toInt else 0
  }

  def isRange(x: Long): Boolean = {
    x <=  Int.MaxValue && x >= Int.MinValue
  }
}