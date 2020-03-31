//Accepted
//Runtime: 404 ms

object _0461_HammingDistance {
    def hammingDistance(x: Int, y: Int): Int = {
         var xor: Int = x ^ y
    var count: Int = 0
    for (i <- 0.until(32)) count += (xor >> i) & 1
    count
    }
}
