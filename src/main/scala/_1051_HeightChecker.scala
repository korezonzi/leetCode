//Accepted
//Runtime: 260 ms
//Memory Usage: 43.9 MB

object _1051_HeightChecker {
  def main(args: Array[String]): Unit = {
    println(heightChecker(Array(2, 3, 4,6,10,5,7)))
  }

  def heightChecker(heights: Array[Int]): Int = {
    val sortedHeights = heights.sorted
    val arrHeights = sortedHeights.zip(heights)
    arrHeights.count(x => x._1 != x._2)
  }
}
