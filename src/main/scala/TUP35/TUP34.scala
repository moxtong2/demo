package TUP35

import scala.io.StdIn

object TUP34 {

  def main(args: Array[String]): Unit = {

    //判断一个年份是否是闰年 闰年的条件是符合下面条件二者之一 （1） 能被4整除 但不能被100整除
    //或者能被400整除
   /* val year=2018
    if((year % 4==0 && year %100 !=0)|| year %400 ==0){
      println(s"当前${year}年是闰年 ")
    }else{
      println(s"当前${year}年不是闰年 ")
    }*/

    //if嵌套
/*    println("请输入运动员的成绩")
    val speed=StdIn.readDouble()
    if(speed<=8){
      println("请输入运动员的性别")
      val gender=StdIn.readChar()
      if (gender == '男'){ //单引号与双引号 这里是有区别的  单引号可以通过 双引号判断不通过
        println("请进入男子组")
      }else{
        println("请进入女子组")
      }
    }else{
      println("你被out了")
    }*/

    //for  循环控制 （for推导式 ）
    //说出10句 hello
    for (i<- 1 to 10){
      println("hello"+i)
    }
    //说明 这种推导式也可以对集合进行遍历

    var list= List(1,2,1,10,"23242")
    for (item <- list){
      println("item"+item)
    }
    //until  遍历 说明  这个是 前闭后开  例如是1到 3-1
    for (i<- 1 until 3 ){
     println("i"+i)
    }

    // for 循环的守卫   if i!=2  相当于java的continue
    for ( i<- 1 to 10 if i!=2){
      println("i循环守卫"+i)
    }
    //引入变量
    for ( i<- 1 to 3; j=4-i){
      println("j"+j)
    }
    //嵌套循环
    for ( i<- 1 to 3; j<-1 to 3 ){
      println("i="+i+"\t j="+j)
    }
    //等价于
   /* for ( i<- 1 to 3){
      for ( j<- 1 to 3) {
        println("i="+i+"\t j="+j)
      }
    }*/

    //yield 关键字的使用
    // 将每次循环的 i放入集合vector 中  并返回 给res
    val res= for(i<- 1 to 10) yield i
    println(res)
    val res2= for(i<- 1 to 10) yield i *2
    println(res2)

    val res3= for(i<- 1 to 10) yield {
      if(i%2==0){
        i
      }else{
        "不是偶数"
      }
    }
    //下面这个方式就提现出了 scala的一个重要的语法特点 就是将一个集合中的各个数据进行处理
    //并返回给新的集合
    println(res3)

    //使用花括号替代小括号
    for ( i<- 1 to 3; j=i*2){
      println("i="+i+"j="+j)
    }
    println("------等价于--------------")
    for {
          i<- 1 to 3
          j=i*2}{
      println("i="+i+"j="+j)
    }

    //如何 实现 for中的i++
    for ( i<- 1 to 4){
      println("i="+i)
    }

    println("------步长控制--------------")
    //Range  (start ,end ,step) Range 不包含10  类似于 until
    for ( i<- Range(1,10,2)){
      println("i="+i)
    }
    println("------步长控制2--------------")
    //第二种不使用Range来实现控制步长的方式
    for ( i<- 1 to 10 if i %2 ==1){
      println("i="+i)
    }

    var count=0
    var sum=0
    for (i<- 1 to 100){
      if(i%9==0){
        count +=1
        sum+=i
      }
    }
    println("count="+count+" \t sum="+sum)
  }

}
