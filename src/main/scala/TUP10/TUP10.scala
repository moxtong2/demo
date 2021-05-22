package TUP10

object TUP10 {

  /**
   * @deprecated 这是一个字符串使用以及$传值
   * @author zhangtong
   * @param args
   */
  def main(args: Array[String]): Unit = {

    var str: String = "Hello"
    var str2: String = " word!"
    println(str + str2)
    var name: String = "tom"
    var age: Int = 23
    var sal: Float = 10.67f
    var height: Double = 180.14
    //格式化输出
    printf("名字是=%s  年龄是%d 薪水是%.2f  高%.3f", name, age, sal, height)
    //scala 支持使用$输出内容 ，变异器会去解析$对应变量
    println(s"\n 个人信息如下 \n 名字 ${name} \n 年龄${age + 10} \n 薪水 ${sal * 100}")
    println(s"\n 个人信息如下 \n 名字 $name \n 年龄$age \n 薪水 $sal ")
  }

}
