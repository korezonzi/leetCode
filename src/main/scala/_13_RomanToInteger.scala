//Status: Accepted
//Runtime: 516 ms
//Memory Usage: 52.3 MB

object _13_RomanToInteger {
  def romanToInt(s: String): Int = {
    val input = s.toList
    def sum(x:Seq[Char]): Int =
      x match {
        case 'I'::'V'::tail => 4 + sum(tail)
        case 'I'::'X'::tail => 9 + sum(tail)
        case 'X'::'L'::tail => 40 + sum(tail)
        case 'X'::'C'::tail => 90 + sum(tail)
        case 'C'::'D'::tail => 400 + sum(tail)
        case 'C'::'M'::tail => 900 + sum(tail)
        case 'I'::tail      => 1 + sum(tail)
        case 'V'::tail      => 5 + sum(tail)
        case 'X'::tail      => 10 + sum(tail)
        case 'L'::tail      => 50 + sum(tail)
        case 'C'::tail      => 100 + sum(tail)
        case 'D'::tail      => 500 + sum(tail)
        case 'M'::tail      => 1000 + sum(tail)
        case _ => 0
            }
        sum(input)
    }
}
