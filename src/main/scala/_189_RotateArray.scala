//Status: Accepted
//Runtime: 520 ms
//Memory Usage: 51.3 MB

object _189_RotateArray {
  def rotate(nums: Array[Int], k: Int): Unit = {
    val aa = k % nums.length
    val r = nums.takeRight(aa) ++ nums.take(nums.length - aa)
    r.zipWithIndex.foreach(x => nums(x._2) = x._1)
  }
}
