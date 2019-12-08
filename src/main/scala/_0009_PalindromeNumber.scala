object _0009_PalindromeNumber {
  def main(args: Array[String]): Unit = {
    println(isPalindrome(252))
    println(isPalindrome(-252))
    println(isPalindrome(-250))
    println(isPalindrome(250))
  }

  def isPalindrome(x: Int): Boolean = {
    if (x == 0 || (!(x.toString.startsWith("-")) && !(x.toString.endsWith("0")) && x.toString == x.toString.reverse)) true
    else false
  }
}

