object _217_ContainsDuplicate {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        val setNums = nums.distinct
        if(nums.length != setNums.length) true
        else false
    }
}
