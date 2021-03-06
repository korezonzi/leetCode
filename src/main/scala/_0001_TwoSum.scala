object _0001_TwoSum {
  def main(args: Array[String]): Unit = {
    println(twoSum(Array(2, 3, 3), 6))
  }

  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    val numIndex = nums.zipWithIndex.toMap
    for(item <- numIndex){

    }
    /*val aa = nums.map(x => Map())
    optArr match {
      case Some(arr) => {
        //arr: 答えの数字の配列
        //数字が重複: 先頭からと後方から検索
        val res1: Int = nums.indexOf(arr(0))
        val res2: Int = nums.lastIndexOf(arr(1))
        Array(res1, res2)
      }
    }*/
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

//引き算, Map[num, index], Mapをループする(Some(n）, None)