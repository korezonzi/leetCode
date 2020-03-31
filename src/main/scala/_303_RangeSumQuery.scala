//Accepted
//Runtime: 684 ms

object _303_RangeSumQuery {
class NumArray(_nums: Array[Int]) {
      val presum = Array.fill(_nums.length + 1)(0)
      for(i <- 0 until _nums.length) {
        presum(i+1) = presum(i) + _nums(i)
      }

      def sumRange(i: Int, j: Int): Int = {
        presum(j+1) - presum(i)
      }
}
}
