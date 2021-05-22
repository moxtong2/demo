package TUP17

object TUP171 {

  def main(args: Array[String]): Unit = {

    println(sayHello)

    var num = 1.2
    var num2 = 1.7f
    //ERROR  num2=num 类型转换异常 Double类型的数据不能向Float 转换
    num2 = num.toFloat //这个可以 转换的原因是得益于 scala的 一切皆对象设计思路 直接可以转

  }

  def sayHello: Nothing = {
    throw new Exception("手动抛出异常")
  }

}
