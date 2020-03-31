//Accepted
//Runtime: 488 ms,

object _414_ThirdMaximumNumber {
    def thirdMax(nums: Array[Int]): Int = {
      val n = nums.distinct.sorted.reverse
      if(n.length < 3)
        return n(0)
      n(2)
    }
}
