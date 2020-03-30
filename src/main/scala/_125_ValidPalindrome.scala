//Status: Accepted
//Runtime: 496 ms
//Memory Usage: 52 MB

object _125_ValidPalindrome {
  def isPalindrome(s: String): Boolean = {
    val l = s.filter(_.isLetterOrDigit).toLowerCase
    l.reverse == l
  }
}
