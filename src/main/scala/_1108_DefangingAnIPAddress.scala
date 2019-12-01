object _1108_DefangingAnIPAddress {
  def main(args: Array[String]): Unit = {
    println(defangIPaddr("1.2.1.3"))
  }

  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }
}
