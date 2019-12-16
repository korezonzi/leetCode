object _884_UncommonWordsFromTwoSentences {
  def main(args: Array[String]): Unit = {
    println(uncommonFromSentences(A = "this apple is sweet", B = "this banana is sweet"))
    println(uncommonFromSentences(A = "this apple is sweet apple", B = "this banana is sweet"))
  }

  def uncommonFromSentences(A: String, B: String): Array[String] = {
    val a = A.split(" ").toSet
    val b = B.split(" ").toSet
    //積集合
    val inter = a & b
    //和集合
    val union = a | b
    //差集合
    (union &~ inter).toArray
  }
}
