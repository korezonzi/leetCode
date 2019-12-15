//Accepted
//Runtime: 824 ms, faster than 8.33%

object _0561_ArrayPartitionI {
  def main(args: Array[String]): Unit = {
    println(arrayPairSum(Array(2, 3,6,20,11,34,98,11,0,1)))
  }

  def arrayPairSum(nums: Array[Int]): Int = {
    //TODO: Study grouped(n)
    // return Iterator[Array[Int]] = <iterator>
    // wanna use for yield...
    nums.sorted.grouped(2).map(_.min).sum
  }
}
