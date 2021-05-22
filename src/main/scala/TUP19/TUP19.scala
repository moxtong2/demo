package TUP19

object TUP19 {

  def main(args: Array[String]): Unit = {


    var a: Char = 97
    println("char=" + a) //当我们输出一个char类型时 他会输出字符对应的数字 （unicode）码值表包含ascii

    var char: Char = 'a'
    var num = 10 + char
    println("num=" + num) //也就是说char类型可以参与运算

    //问题 ：var c2:Char='a'+1  这个是错误的 会报类型转换错误  可以把char给int 但是不能把int给char
    //当把一个计算的结果赋值给一个变量  则编译器会进行类型转换及判断
    //当我们把一个自变量赋值给一个变量 则编译器会进行范围判断
    var c5: Char = 9999

    /*
     题目 scala中 计算3的平方根  然后再对该值求平方 现在这个结果与3相差多少
     解答：
       scala> var x=3.0
       var x: Double = 3.0

       scala> val y=math.sqrt(x)
       val y: Double = 1.7320508075688772

       scala> val z=y*y
       val z: Double = 2.9999999999999996

       scala> val diff=x-z
       val diff: Double = 4.440892098500626E-16


   题目 ：10 max 2的含义是什么？max方法定义在哪个类中？
    1. scala> 10 max 2
    res0: Int = 10
    scala> 7 max 8
    res1: Int = 8
    scala> 0 max 0   8.  res2: Int = 0

    所以在RichInt中。


    6.用BigInt计算2的1024次方?
    BigInt(2).pow(1024)

    在Scala中如何获取字符串的首字符和尾字符？

    1. //获取首字符
    "Hello"(0)
    "Hello".take(1)
    //获取尾字符
    "Hello".reverse(0)
    "Hello".takeRight(1)

    scala> "hello".take(1)
    val res3: String = h

    scala> "hello".reverse.take(1)
    val res4: String = o

     */

    val s = "crazy"
    val ss = 3
    var c = s * ss
    println("c=" + c) //当一个字符串乘以Int类型的n时  就会重复拼接n次 作为输出对象

  }
}
