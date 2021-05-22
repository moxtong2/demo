package TUP32

object TUP32 {
  def main(args: Array[String]): Unit = {

    val num = if(5>4) 5 else 7

    val n1=4
    val  n2= 8
    var  res= if(n1>n2) n1 else n2
    val  n3= 11
    println("res= "+res)
    res = if (res > n3 ) res else n3
    println("res= "+res)
  }
}
