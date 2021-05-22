package TUP61

object TUP61 {
  def main(args: Array[String]): Unit = {
    //f11()//如果想要不报错  就需要加入 try{}catch{}
    //scala 中 只有运行时异常


  }

  //声明式异常
  @throws(classOf[NumberFormatException]) //等同于java NumberFormatException.class
  def  f11()={
    "abc".toInt
  }
}
