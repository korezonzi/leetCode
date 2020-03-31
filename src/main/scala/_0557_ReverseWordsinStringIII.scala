//Accepted
//Runtime: 4472 ms,

object _0557_ReverseWordsinStringIII {
  def reverseWords(s: String): String = {
    val seq = s.split(" ")
    val seqRev = seq.map((_.reverse))
    seqRev.mkString(" ")
  }
}
