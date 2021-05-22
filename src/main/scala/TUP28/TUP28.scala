package TUP28

object TUP28 {

  def main(args: Array[String]): Unit = {

    /*
    题目 ：假如还有97天放假 问 ：还有xx个星期零xx天
    1搞清需求
    2思路分析
    （1）变量保存97
    （2） 使用/7 得到几个星期
     (3) 使用 %7 得到剩余几天
     */
    //代码实现
    val  day =97
    printf("统计结果是 %d个星期零%d天",day/7,day % 7)


    val huahis = 232.5

    val sheshi= 5.0/9 *(huahis - 100)
    println(" \n 得到的摄氏温度是"+sheshi.formatted("%.2f"))

    val   r1:Int=10/3
    println("r1= "+r1)
    val   r2:Double=10/3
    println("r2= "+r2)
    val   r3:Double=10.0/3 //如果不加.0 scala 默认取整
    println("r3= "+r3)
    println("r3= "+r3.formatted("%.3f")) //formatted 保留几位小数


  }
}
