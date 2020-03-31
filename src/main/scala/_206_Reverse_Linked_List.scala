//Status: Accepted
//Runtime: 480 ms
//Memory Usage: 51.1 MB

object _206_Reverse_Linked_List {
  def reverseList(head: ListNode): ListNode = {
    def loop(list: ListNode, prev: ListNode): ListNode = {
      list match {
        case currHead: ListNode =>
          val next: ListNode = currHead.next
          currHead.next = prev
          loop(next, currHead)
        case _ =>
          prev;
      }
    }
    loop(head, null)
  }
}
