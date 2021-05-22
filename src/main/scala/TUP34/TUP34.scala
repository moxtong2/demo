package TUP34

import scala.io.StdIn

object TUP34 {
  def main(args: Array[String]): Unit = {

    println("请输入姓名：...")
    val name = StdIn.readLine()
    println("请输入年龄：...")
    val age = StdIn.readInt()
    println("请输入薪水：...")
    val sal = StdIn.readDouble()
    printf("用户信息是：name=%s  age=%d  sal=%.2f",name,age,sal)
  }

}
