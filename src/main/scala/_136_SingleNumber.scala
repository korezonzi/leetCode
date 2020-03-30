class _136_SingleNumber {
    def singleNumber(nums: Array[Int]): Int = {
        nums.reduce((v1, v2) => ~(v1 ^ v2))
    }
}
