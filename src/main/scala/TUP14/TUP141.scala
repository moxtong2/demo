package TUP14

/**
 * SCALA  类型推导
 */
object TUP141 {

  def main(args: Array[String]): Unit = {


    var num = 10 //这时编译器会默认推导出它的类型为Int类型

    //方式1 ，可以利用idea查询
    //方式2 ，可以使用isInstanceOf[Int] 来判断是否为Int类型
    println(num.isInstanceOf[Int])

    //当一个类型确定后就不能改变了 说明scala是强类型语言
    val dog = new Dog //引用内部类
    dog.age = 101
    dog.name = "发发" //重新赋值
    println(s"${dog.name}")

    //val 修饰的变量 是不可修改的 编译最后是加了一个final类型的 而var是可以改变的 ，但是不能改变其中类型
  }

  /**
   * 我们重新创建一个类
   */
  class Dog {
    var age: Int = 0
    var name: String = "GOUT"

  }

}
