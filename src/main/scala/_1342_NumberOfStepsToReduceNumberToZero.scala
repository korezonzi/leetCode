//Status: Accepted
//Runtime: 376 ms
//Memory Usage: 50 MB

object _1342_NumberOfStepsToReduceNumberToZero {
  def main(args: Array[String]): Unit = {
    println(numberOfSteps(12))
  }

  def numberOfSteps (num: Int): Int = {
    @scala.annotation.tailrec
    def countDivide(num: Int, count: Int): Int = {
      num match {
        case 0 => count
        case even if (even % 2 == 0) => countDivide(num / 2, count + 1)
        case odd if (odd % 2 != 0) => countDivide(num - 1, count + 1)
      }
    }
    countDivide(num, 0)
  }
}
