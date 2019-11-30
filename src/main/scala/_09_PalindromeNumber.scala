object _09_PalindromeNumber {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(252))
  }

  def isPalindrome(x: Int): Boolean = {
    if (x == 0 || (!(x.toString.startsWith("-")) && !(x.toString.endsWith("0")) && x.toString == x.toString.reverse)) true
    else false
  }
}

