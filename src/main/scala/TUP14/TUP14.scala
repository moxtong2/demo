package TUP14

/**
 * scala 变量的基本使用
 */
object TUP14 {

  def main(args: Array[String]): Unit = {
    //在scala中小数默认为double 整数默认为Int类型
    var age: Int = 10
    var sal: Double = 10.9
    var name: String = "tom"
    var isPass: Boolean = true
    var score: Float = 10.9f

    println(s"${age}  ${isPass}")

  }
}
