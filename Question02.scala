object Question02 {

  def insertInOrder(x:Int, list:List[Int]):List[Int] = {
    if (list.isEmpty) return List(x)
    if (list.head > x) return x :: list
    else return list.head :: insertInOrder(x, list.tail)
  }
  def main(args: Array[String]): Unit = {
    println("----Question 02------")
    var listNum = List(0, 1, 2, 3, 4)
    var listNum1 = List(0, 1, 3, 4)
    var listNum2= List(0, 100, 100, 100, 2000, 300000)
    //println(insertInOrder(500, listNum))
    //println(insertInOrder(2, listNum1))
    println(insertInOrder(101, listNum2))
    println(insertInOrder(99, listNum2))
    //println(insertInOrder(3060, listNum2))
    //println(insertInOrder(50000000, listNum2))
  }
}
