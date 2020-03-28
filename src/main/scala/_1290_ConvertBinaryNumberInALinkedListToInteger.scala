//Accepted
//Runtime: 260 ms
//Memory Usage: 44.9 MB

object _1290_ConvertBinaryNumberInALinkedListToInteger {
  /**
 * Definition for singly-linked list.
 */
  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def main(args: Array[String]): Unit = {
    //println(_1290_ConvertBinaryNumberInALinkedListToInteger(ListNode(1,0,1)))
  }

  def getDecimalValue(head: ListNode): Int = {
    //remove :"[]" and ","
    val num = head.toString.init.tail.replace(",","")
    //2進数-> 10進数
    val toInt =  Integer.parseInt(num, 2)
    toInt
  }
}
