//Status: Accepted
//Runtime: 440 ms
//Memory Usage: 49.8 MB
object _804_UniqueMorseCodeWords {
  def uniqueMorseRepresentations(words: Array[String]): Int = {
    val codes = Array(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    words.map(s => s.map(c => codes(c -'a')).mkString).distinct.size
  }
}
