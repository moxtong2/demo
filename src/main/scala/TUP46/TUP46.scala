package TUP46

object TUP46 {
  def main(args: Array[String]): Unit = {
   //while 循环的语法
    var i=0
    while(i <10){//while 也不包含10类似until  结果是unit 类型 推荐使用for
      println("i="+i)
      i+=1
    }


    //do while 至少执行一次
    var y=10
    do{
        println("y="+y)
        y+=1

    }while(y<10)

    //九九乘法表 小意思啦
    for (i<- 1 to 9){
      for (j<- 1 to i){
        printf("%d * %d = %d \t",j,i,(i*j))
      }
      println()

    }

  }

}
