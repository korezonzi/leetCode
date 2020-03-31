//Accepted
//Runtime: 496 ms

import java.util

object _283_MovesZero {
      def moveZeroes(nums: Array[Int]): Unit = {
        var left = 0
        var right = 0
        while (right < nums.length) {
            if (nums(right) != 0) {
                nums(left) = nums(right)
                left += 1
            }
            right += 1
        }
        util.Arrays.fill(nums, left, right, 0)
    }
}
