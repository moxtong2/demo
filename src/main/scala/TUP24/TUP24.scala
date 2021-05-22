package TUP24

object TUP24 {

  def main(args: Array[String]): Unit = {

    //java 中的强制转换  ==>int num =(int) 2.5
    //scala 中的强制转换 ==> var num:Int =2.7.toInt //sca

    val num: Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    val num2: Int = (10 * 3.5 + 6 * 1.5).toInt
    println(num + "   " + num2)

    val chr2: Char = 1
    val num3 = 1
    //val  char2 :Char=num3 // Char 可以保存常量值 但是不是保存变量值(变量值有类型)


    /*
    作业
    1==> var s:Short =5 //ok
    s=s-2 //error Int-->Short
    2==> var b :Byte =3 //ok
    b=b+4 //error Int -->Byte
    b=(b+4).toByte //ok
    var c:Char ='a' //ok
    var i:Int =5//ok
    var d :Float =3.14f //ok
    var result :Double =c+i+d //ok  Float-->Double
    var b:Byte =5//ok
    var s:Short =3 //ok
    var t:Short =s+b //error  Int-->Short
    var  t2=s+b //ok  使用了类型推导




     */


  }
}
