//Status: Accepted
//Runtime: 568 ms

object _242_Balid_Anagram {
  def isAnagram(s: String, t: String): Boolean = {
    s.sorted.equals(t.sorted)
  }
}
