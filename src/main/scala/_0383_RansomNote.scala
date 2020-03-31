//	Accepted
//Runtime: 564 ms

object _0383_RansomNote {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
      ransomNote.intersect(magazine) == ransomNote
    }
}
