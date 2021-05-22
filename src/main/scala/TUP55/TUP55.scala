package TUP55

object TUP55 {
  def main(args: Array[String]): Unit = {
    //形参列表和返回值列表的数据类型可以是值类型 和引用类型

    val tiger = new Tiger
    val tiger2 = test01(10, tiger)
    println(tiger2.name)//jack
    println(tiger.name)//jack
    println(tiger.hashCode() + " \n" + tiger2.hashCode())//判断是否是同一个对象

   println("s ="+test03("hihih"))
  }

  def test01(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name = "jack"
    tiger //scala 根据最后一行自动推断类型  所以 返回值类型也是可以去掉的
    //如果函数使用了return ，那么就不会使用自行推导 ，那么返回值类型就不可以去掉了。
    //假如返回值什么都没有写
  }

  def test02(n1: Int, n2: Int) {
    return  n1 + n2
    //  如果返回值什么都没有写 那就是没有返回值 ，return 无效
    // 如果返回值明确是Unit 类型  那么函数体你写return 都无效，不会有返回值
  }

  //如果返回值不确定 如下 就是用Any
  def test03(n1: String):Any={
    if(n1.length>3){
      n1+"123"
    }else{
      3
    }

  }


}

class Tiger {
  var name = ""
}
