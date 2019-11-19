import scala.collection.View.Empty

object _01_TwoSum {
  def main(args: Array[Int]): Unit = {
    println(twoSum(Array(3, 2, 4), 6))
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var result: Array[Int] = Array.empty
    var num = 0
    for (num <- nums) {
      val res = target - num
      result = nums.filter(_ == res) :+ num
    }
    result
  }
}