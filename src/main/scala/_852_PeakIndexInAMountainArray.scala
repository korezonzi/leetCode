//Accepted
//Runtime: 332 ms
//Memory Usage: 51.4 MB

object _852_PeakIndexInAMountainArray {
  def main(args: Array[String]): Unit = {
    println(peakIndexInMountainArray(Array(2, 3, 4, 6)))
  }

  def peakIndexInMountainArray(A: Array[Int]): Int = {
    A.indexOf(A.max)
  }
}
