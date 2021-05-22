package TUP52

object TUP52 {
  def main(args: Array[String]): Unit = {
    val n1= 10
    val n2=20
    println("res="+ get(1,2,'|'))


  }

  //''单引号是Char，双引号 是String  ,总之如果是单引号都是单引号
  // 类型不确定 可以去掉类型
  def get(n1:Int,n2:Int,oper:Char)={
    if(oper=='+'){
      n1+n2
    }else if(oper=='-'){
      n1-n2
    }else{
      null
    }
  }
}
