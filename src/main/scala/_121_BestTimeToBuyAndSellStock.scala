//Status: Accepted
//Runtime: 484 ms
//Memory Usage: 50.7 MB

object _121_BestTimeToBuyAndSellStock {
  def maxProfit(prices: Array[Int]): Int = {
    if(prices.isEmpty) return 0
    var min = prices(0)
    var max = 0
    for(i <- prices.indices){
      min = Math.min(min, prices(i))
      max = Math.max(max, prices(i) - min)
    }
    max
  }
}