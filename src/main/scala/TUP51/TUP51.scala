package TUP51

object TUP51 {
  def main(args: Array[String]): Unit = {

    //使用方法 创建对象
    var dog=new Dog
    println("sum = "+dog.sum(1,2))
    //方法转函数
    val f1= dog.sum _
    println("f1= "+f1)
    println("f1= "+f1(20,30))
    //函数 求两个数的和
    val f2 =(n1:Int,n2:Int)=>{
      n1 + n2
    }
    println("f2= "+f2)
    println("f2= "+f2(4,4))

  }
}

class  Dog{

  def  sum(n1:Int,n2:Int):Int={
    n1+n2
  }
}