object _07_ReverseInteger {
  def reverse(x: Int): Int = {
    val arrNum = x.toString.toArray
    arrNum match {
      case true if(arrNum.last == 0) => {
        case true if(arrNum.head == "-") => 11111
        case false                       => 11111
      }
      case false => {
        case true if(arrNum.head == "-") => 11111
        case false                       => 11111
      }
    }
  }
}
