import scala.collection.mutable.ArrayBuffer

object _1389_CreateTargetArrayInTheGivenOrder {
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    val sumSeq = nums.zip(index)
    val b = ArrayBuffer.empty
    //val b = Seq.empty
    val aa = for{seq <- sumSeq} yield {
      b.insert(seq._2,seq._1)
    }
//    val numSeq = Array(0,1,2,3,4)
//    val indexSeq = Array(0,1,2,2,1)
//    val su = indexSeq.zip(numSeq)
//    //(要素があったら) その後ろの要素を切り取る
//    //num足す
//    //切り取ったのを足す
//    var result = Seq.empty
//    val tmp = Seq.empty
//    val aa= for{num <- su}yield {
//      if(result.length > num._1 ){
//        result.patch(num._1,Seq(num._2),0)
//      }else {
//        result :+ num._2
//      }
//    }
  }
}
