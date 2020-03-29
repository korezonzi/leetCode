//Status: Accepted
//Runtime: 604 ms
//Memory Usage: 51.5 MB


object _53_MaximumSubarray {
  def maxSubArray(nums: Array[Int]): Int = {
    var max = nums(0)
    var cur = nums(0)
    for (i <- 1 until nums.length) {
      cur = Math.max(cur+nums(i), nums(i))
      //println(cur)
      max = Math.max(max, cur)
      println(max)
      //println("------")
    }
  max
  }
}
