package TUP60

object TUP60 {

  //scala  异常处理

  def main(args: Array[String]): Unit = {

   /* try{
      val r= 10/0
      //SCALA 中只有一个catch
      //scala  中有多个case 每个case可以匹配对应的异常

    }catch {
      case ex: ArithmeticException=>{
      println("捕获到异常ArithmeticException了")
      }
      case e:Exception=>{
        println("捕获到异常Exception了")
      }
    }finally {
      println("最终执行了finally")
    }

    println("ok 可以继续执行")*/

    //test()
    //println("ok 可以继续执行")//上面跑出异常 下面是不会正常输出的

    //必须要处理异常
    try{
      test()
    }catch {
          //范围小的 写前面 大的写后面
      case  ex:Exception=> println("捕获到异常了"+ex.getMessage)
    }finally {
      println("执行了finally")
    }
  }


  def test():Nothing={
    throw  new Exception("手动跑出异常")
  }

}
