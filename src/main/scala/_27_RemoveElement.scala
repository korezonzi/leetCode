//Status: Accepted
//Runtime: 464 ms
//Memory Usage: 52.2 MB

object _27_RemoveElement {
  def removeElement(nums: Array[Int], aa: Int): Int = {
    var j = 0
    for(i <- 0 until nums.length) {
      nums(j) == nums(i)
      if(nums(i) != aa)
        j +=1
    }
    j
  }
}