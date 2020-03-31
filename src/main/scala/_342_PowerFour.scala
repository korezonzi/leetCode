//Accepted
//Runtime: 424 ms
object _342_PowerFour {
  def isPowerOfFour(num: Int): Boolean = {
    num match {
      case 1 => true
      case num if num == 0 || num % 4 != 0 => false
      case _ => isPowerOfFour(num / 4)
    }
  }
}
