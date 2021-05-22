package TUP57

object TUP57 {

  def main(args: Array[String]): Unit = {
    println(sayOk("mary")) //覆盖形参默认值

    //
    mysqlCon() //输出默认值
    mysqlCon("127.0.0.1", 9999) //从左到右覆盖
    //如果希望指定覆盖默认值 例如修改用户名密码
    mysqlCon(user = "tom", pwd = "2w3e")
  }

  //name的形参默认值jack
  def sayOk(name: String = "jack"): String = {
    return name + "ok！"
  }

  def mysqlCon(add: String = "localhost", port: Int = 3306,
               user: String = "root", pwd: String = "root"): Unit = {
    println("add= " + add + " \n port=" + port + "\n user=" + user + "\n pwd=" + pwd)
  }
}
