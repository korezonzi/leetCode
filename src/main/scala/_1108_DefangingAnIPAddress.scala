object _1108_DefangingAnIPAddress {
  def main(args: Array[String]): Unit = {
    println(defangIPaddr("1.2.1.3"))
    println(defangIPaddr("0.2.1.3.0"))
  }

  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }
}
