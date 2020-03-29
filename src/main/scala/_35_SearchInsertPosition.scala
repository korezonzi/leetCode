object _35_SearchInsertPosition {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    nums.takeWhile(_ < target).length
  }
}
