//	Accepted
//Runtime: 396 ms,

object _0509_FibonacciNumber {
    def fib(N: Int): Int = {
        val mem: Array[Int] = Array.fill(N+1)(-1)
        mFib(N, mem)
    }

    def mFib(N: Int, mem: Array[Int]): Int = {
        if(mem(N) == -1){
        N match {
                case 0 => mem(0) = 0
                case 1 => mem(1) = 1
                case _ => mem(N) = mFib(N-1, mem) + mFib(N-2, mem)
            }
        }
        mem(N)
    }
}
