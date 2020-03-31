//Accepted
//Runtime: 576 ms

object _0459_RepeatedSubstringPattern {
    def repeatedSubstringPattern(str: String): Boolean = {
      ((str + str).indexOf(str, 1)) < str.length
    }
}
