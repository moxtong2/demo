package TUP17

object TUP17 {

  def main(args: Array[String]): Unit = {


    var  num :Int =10

    //因为Int是一个类 因此它的一个实例就是可以使用很多方法
    //在scala中 如果一个方法没有形参 则可以省略括号
    println(num.toDouble +"\t" +num.toString + 100.toString) //scala 一切皆对象

    sayHi

  }

  //定义一个形参
def sayHi () :Unit={
  println( "HELLO  WORD")
}

}
