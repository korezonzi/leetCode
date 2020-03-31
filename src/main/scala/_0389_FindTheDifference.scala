//	Accepted
//Runtime: 500 ms,

object _0389_FindTheDifference {
    def findTheDifference(s: String, t: String): Char = {
        (t diff s).head
    }
}
