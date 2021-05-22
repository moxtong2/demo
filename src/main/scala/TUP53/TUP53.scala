package TUP53

object TUP53 {
  def main(args: Array[String]): Unit = {
    test(4)
  }

  def test(n1: Int){
    if (n1 > 2) {
      test(n1 - 1)
    }
    println("n1= " + n1)
  }

  /**
   *
   *递归
   *
   */
}
