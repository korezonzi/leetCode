//Status: Accepted
//Runtime: 452 ms
//Memory Usage: 49.9 MB


object _202_Happy_Number {
  def isHappy(n: Int): Boolean = {
    def next(n: Int): Int =
      n.toString.map(x => (x - '0') * (x - '0')).sum

    def solve(n: Int, vis: Set[Int]): Boolean = n match {
      case 1 => true
      case x if vis.contains(x) => false
      case x => solve(next(n), vis + n)
    }

    solve(n, Set[Int]())
  }
}
