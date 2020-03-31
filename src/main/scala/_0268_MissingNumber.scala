//Status: Accepted
//Runtime: 540 ms

object _0268_MissingNumber {
    def missingNumber(nums: Array[Int]): Int = {
      //公式利用
      nums.length * (nums.length + 1) / 2 - nums.sum
    }
}
