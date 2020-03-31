//Accepted
//Runtime: 432 ms

object _0290_WordPattern {
    def wordPattern(pattern: String, str: String): Boolean = {
      val words = str.split(' ')
      (words.length == pattern.length) && {
        val (wd, pd) = (words zip pattern).distinct.unzip
        (wd.length == wd.distinct.length) && (pd.length == pd.distinct.length)
      }
    }
}
