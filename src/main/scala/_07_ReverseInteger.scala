object _07_ReverseInteger {
   def main(args: Array[String]): Unit = {
    println(reverse(-12049490))
  }
  def reverse(x: Int): Int = {
    val numList =
      if(x == 0 ) 0
      else{ x.toString.toList  match {
        case y if((y.endsWith(("0")) && (y.startsWith("-")))) => ("-" +: y.init.drop((1)).reverse).mkString("").toInt
        case zero if((zero.endsWith("0")))   => zero.init.reverse.mkString("").toInt
        case minus if(minus.startsWith("-")) => ("-" +: minus.drop(1).reverse).mkString("").toInt
        case x => x.reverse.mkString("").toInt
      }
    }
    numList
  }
}
