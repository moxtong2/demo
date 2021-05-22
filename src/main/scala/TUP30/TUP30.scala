package TUP30

object TUP30 {

  def main(args: Array[String]): Unit = {

var  num=2
    num <<= 3  //相当于乘与2的移位数次幂
    println("<<= 等于 "+num)
    num >>= 1  //相当于除以2的移位数次幂
    println("<<= 等于 "+num)
    //按位与后赋值&=
    //按位异或后赋值

    //scala中支持  代码块返回值

    val rel={
      if(num>1) "relleo" else 100
    }
    println("ss"+rel)

  }

  //不使用中间变量的情况下 我们交换彼此的值
  var a = 10
  var b=20

  a = a + b// a=30
  b = a - b //b=10
  a = a - b //a=20
  //scala 中不支持三目运算符  例如 ： val num =5>4 ? 5:6




}
