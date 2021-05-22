package TUP26

object TUP26 {

  def main(args: Array[String]): Unit = {

    val  d1=1.2
    val  s1=d1 + ""

    //首字符为操作符 （比如 + - * /） 后续字符也需要跟操作符 至少一个
     val ++ ="hello word"
    println("ddd \n"+ ++)//++ 会被编译器处理成 $plus$plus

    //不能使用下划线 作为标识符

    var num =10
    num +=1  //在java 中num++ 在scala中表示为 +=  相对应的 -= 就是num--
    println(num)
    num -=1
    println(num)


  }
}
