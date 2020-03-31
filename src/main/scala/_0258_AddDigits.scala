//Status: Accepted
//Runtime: 420 ms
//Memory Usage: 50.5 MB

object _0258_AddDigits {
    def addDigits(num: Int): Int = {
        if(num ==0) {
          0
        }else {
          var sum = num%9
          if(sum == 0) 9
          else sum
        }
    }
}
