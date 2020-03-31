//Accepted
//Runtime: 1164 ms

object _0448_FindAllNumbersDisappearedInAnArray {
    def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
        var set = Set.empty[Int]
    (1 to nums.length).foreach(set += _)
    for (i <- nums) set -= i
    set.toList
    }
}
