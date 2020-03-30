//Status: Accepted
//Runtime: 448 ms
//Memory Usage: 50 MB

object _58_LengthOfLastWord {
  def lengthOfLastWord(s: String): Int = {
    val strs = (s.trim).split(" ")
    strs(strs.length-1).length
  }

//          if(s.contains(" ")) {
//          val seq = s.split(" ")
//          if(seq.length > 1) seq(1).length
//          else  0
//        }else {
//          s.length
}
