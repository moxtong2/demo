package TUP62

object TUP62 {

  def main(args: Array[String]): Unit = {
    //函数式练习
    //方法一
    //f2(20)
    //方法二

    /*f3()*/
    print99(9)

  }

  // 按照金字塔要求就是先打印空格 再打印 星号
  // 法2，分开打印
  def f2(n: Int) = {
    for (i <- 1 to n) {
      for (j <- 1 to (n - i)) {
        print(" ") //遍历打印空格
      }
      for (j <- 1 to i if i % 2 != 0) { //不等于1是偶数  去掉if 后的判断是打印所有
        print("* ") //遍历打印*
      }
      println() //换行
    }
  }

  def f1(n: Int) = {
    for (i <- 1 to n) {
      println(" " * (n - i) + "* " * i)
    }

  }


  def f3() = {

      println("* " * 3)//当数字跟字符用星号链接时表示 同样数量的字符

  }

  def print99(n:Int): Unit ={
    for (i<- 1 to n){
      for(j<- 1 to i){
        printf("%d * %d =%d\t",j,i,j * i)
      }
      println()
    }
  }
}
