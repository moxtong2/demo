package TUP54

/**
 * scala 实现递归的案例
 */
object TUP54 {
  def main(args: Array[String]): Unit = {
    //斐波那契
    /**
     * 使用递归方式 求出斐波那契数 1，1，2，3，5，8，13  给你一个整数N
     * 求出它的斐波那契数
     */
    println("fbn的结果是="+fbn(7))

    /**
     *求函数值 已知 f(1)=3 ;f(n) =2*f(n-1)+1;
     */
    println("fbn的结果是="+f(2))

    /**
     * 猴子吃桃子的问题
     * 猴子第一天吃了其中的一半 并再多吃了一个
     * 以后每天都吃其中的一半 然后再多吃一个
     * 当第十天时 想再吃时 发现只有一个桃子了
     * 问 最初有多少个桃子
     *
     * day=10 桃子有1个
     * day=9  桃子有（day10[1]+1）*2
     * day=8  桃子有 （day[4]+1）*2
     */
    println("桃子的个数是="+peach(1))

  }

  /**
   * 函数 斐波那契
   * @param n
   * @return
   */
  def  fbn(n:Int):Int={
    //分析
    //1 当n=1 时结果是1
    //2 当n=2 时结果是1
    //3 当n>2 时结果是前面两个数之和  2


    if(n==1|| n==2){
      1
    }else{
      fbn(n-1)+fbn(n-2)
    }

  }

  /**
   * 套用公式即可
   * @param n1
   * @return
   */
  def f(n1:Int):Int={
    if (n1==1){
      3
    }else{
      2*f(n1-1)+1
    }
  }

  def peach (day:Int):Int={
    if(day==10){
      1
    }else{
      (peach(day+1)+1)*2
    }
  }

}
