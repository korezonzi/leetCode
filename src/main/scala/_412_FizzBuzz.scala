//Accepted
//Runtime: 452 ms

object _412_FizzBuzz {
    def result(n: Int) : String = {
        var x = (n % 3, n % 5)
        x match {
            case (0, 0) => "FizzBuzz"
            case (0, _) => "Fizz"
            case (_, 0) => "Buzz"
            case (_, _) => n.toString
        }
    }

    def fizzBuzz(n: Int): List[String] = {
        (1 to n).toList.map(x => result(x))
    }
}
