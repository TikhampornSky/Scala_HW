object Question01 {

  def insertLast(x:Any, l:List[Any]) : List[Any] ={
    return l ++ List(x)
  }

  def main(args: Array[String]): Unit = {
    println("-------------Question 01-------------")
    var listNum = List(1, 2, 3, 4, 5)
    var listNum1 = List(10, 30, 40, 50)
    var listNum2 = List(-1, 0, 2, 6, 5)
    println(insertLast(6666, listNum))
    println(insertLast(-6666, listNum1))
    println(insertLast(6688, listNum2))
  }
}
