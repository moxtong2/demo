package TUP50

import scala.util.control.Breaks.{break, breakable}

object TUP50 {

  def main(args: Array[String]): Unit = {
    var n = 1
    //breakable 对break方法抛出的异常做了处理 代码就继续执行
    breakable {
      while (n <= 20) {
        n += 1
        if (n == 18) {
          break()
        }
        println(n)
      }
    }

    //使用循环守卫模拟continue  当 if(i!=2 && i!=3)为真的时候 才执行循环体
    //也就是相当于跳过了2与3
    for (i <- 1 to 9 if (i != 2 && i != 3)) {
      println("i=" + i)
    }

    //可以写成下面的形式 使用if
    for (i <- 1 to 9) {
      if (i != 2 && i != 3) {
        println("i=" + i)
      }
    }

    //100以内的数求和 求出当和 第一次大于20的当前数
    var num = 0
    breakable {
      for (i <- 1 to 100) {
        num += i
        if (num > 20) {
          println("第一次大于20的当前数是：" + i)
          break()
        }
      }
    }

    //第二种方式 使用循环守卫来解决 类似的问题
    var num2=0
    var  loop =true

    for(i<-1 to 100 if  loop ==true){
     //利用循环守卫特性 if 必须是真的情况才会执行循环体
      num2+=i
      if(num2>20){
        loop=false
        println("第一次大于20的当前数是：" + i)
      }

    }

  }
}
