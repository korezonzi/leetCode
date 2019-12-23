//Status: Accepted
//Runtime: 304 ms
//Memory Usage: 50.1 MB

object _1295_FindNumbersWithEvenNumberOfDigits {
  def main(args: Array[Int]): Unit = {
    println(findNumbers(Array(2, 3, 3, 299,1000,2989)))
  }

  def findNumbers(nums: Array[Int]): Int = {
    nums.count(_.toString.length %2 == 0)
  }
}
