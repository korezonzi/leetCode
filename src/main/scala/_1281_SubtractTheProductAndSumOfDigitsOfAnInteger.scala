object _1281_SubtractTheProductAndSumOfDigitsOfAnInteger {
  def main(args: Array[String]): Unit = {
    println(subtractProductAndSum(123))
    println(subtractProductAndSum(1))
    println(subtractProductAndSum(120))
  }

  def subtractProductAndSum(n: Int): Int = {
    //n => Array[Int]
    val nList = n.toString.split("").map(x => x.toInt)
    //aa.foldLeft(0)((x,y) => x+y) = sum
    //aa.foldLeft(1)((x,y) => x*y) = product
    nList.product - nList.sum
  }
}
