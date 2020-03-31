//Accepted
//Runtime: 540 ms

object _326_PowerOfThree {
  def isPowerOfThree(n: Int): Boolean = {
    n match {
      case 1 => true
      case 0 || n % 3 != 0 => false
      case _ => isPowerOfThree(n / 3)
    }
  }
}
