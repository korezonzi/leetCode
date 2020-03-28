//Status: Accepted
//Runtime: 528 ms
//Memory Usage: 51.2 MB

object _1313_DecompressRunLengthEncodedList {
  def main(args: Array[String]): Unit = {
    println(decompressRLElist(Array(2,25,4,3)))
  }

  def decompressRLElist(nums: Array[Int]): Array[Int] = {
    val seqTuple = nums.grouped(2).toSeq
    var result = Seq.empty
    val padtoSeq = for{seq <- seqTuple}yield result.padTo(seq.head.toInt,seq.last.toInt)
    padtoSeq.flatten.toArray
  }
}
