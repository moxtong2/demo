package TUP56

object TUP56 {
  def main(args: Array[String]): Unit = {
    //函数中可以再声明/定义函数
    //类中可以再声明类  方法中可以定义方法
    def f1(): Unit = { // private  final
      println("f1")
    }

    println("OK~~~")
  }

  def sayOk(): Unit = {
    println("main sayok")
  }
}
