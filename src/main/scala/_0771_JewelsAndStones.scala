object _0771_JewelsAndStones {
  def main(args: Array[String]): Unit = {
    println((numJewelsInStones(("aA"),("aaAbbzon"))))
    println((numJewelsInStones(("aA"),("aaAmazonaAooa"))))
  }
  def numJewelsInStones(J: String, S: String): Int = {
    val sList = S.split("")
    val jList = J.split("")
    var result = 0
    for(x <- jList){
      result += sList.count( y => y.contains(x))
    }
    result
  }
}
