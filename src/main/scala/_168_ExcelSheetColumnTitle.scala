object _168_ExcelSheetColumnTitle {
  def convertToTitle(n: Int): String = {
    val result: StringBuilder = new StringBuilder()
    var num = n
    while (n > 0) {
      num -= 1
      result.insert(0, ('A' + n % 26).toChar)
      num /= 26
    }
    result.toString
  }
}
