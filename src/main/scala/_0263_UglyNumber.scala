//Status: Accepted
//Runtime: 428 ms
//Memory Usage: 48.9 MB

object _0263_UglyNumber {
  val primes = List(5, 3, 2)
  def isUgly(num: Int): Boolean = {
    if (num <= 0) false
    else if (num == 1) true
    else {
      var n = num
      primes.foreach(p => n = revase(n, p))
      n == 1
    }
  }
    def revase(num: Int, p: Int): Int = {
        if (num % p != 0) num
        else revase(num / p, p)
    }
}
