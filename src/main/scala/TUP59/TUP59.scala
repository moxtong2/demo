package TUP59

object TUP59 {
  //惰性函数

  def main(args: Array[String]): Unit = {

    //说明 没有lazy的时候 直接分配内存 可以直接输出结果
    //而加入lazy修饰 val （lazy也只能修饰val 不能修饰var） 时 不分配内存
    // 只是预加载
    lazy val res=sum(10,20)
    println("====================")
    println("res = "+res)//当正真调用的时候 才是需要分配内存的时候

  }

  def sum(n1:Int,n2:Int):Int={

    println("sum 执行了。。。。")
    return n1+n2

  }

  /**
   * 没有添加懒加载
   * sum 执行了。。。。
     ====================
   */

  /**
   * 加入懒加载 执行结果
   *  ====================
   *
   */

  /**
   * 正真调用输出的时候（lazy修饰）
   * ====================
      sum 执行了。。。。
      res = 30
   */
}
