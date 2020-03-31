//	Accepted
//Runtime: 560 ms,

object _0392_IsSubsequence {
    def isSubsequence(s: String, t: String): Boolean = {
            if (s.isEmpty) return true

    var idx = 0
    for (one <- t) {
      if (one == s(idx)) idx += 1
      if (idx == s.length) return true
    }
    false
    }
}
