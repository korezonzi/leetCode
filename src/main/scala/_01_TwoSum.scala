object _01_TwoSum {
  def main(args: Array[String]): Unit = {
    println(twoSum(Array(2, 3, 3), 6))
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val optArr = nums.combinations(2).find(_.sum == target)
    optArr match {
      case Some(arr) =>
      {
        //arr: 答えの数字の配列
        //数字が重複: 先頭からと後方から検索
        val res1:Int = nums.indexOf(arr(0))
        val res2:Int = nums.lastIndexOf(arr(1))
        Array(res1, res2)
      }
    }
  }
}