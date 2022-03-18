object Question03 {
  def member(l:List[Any], x:Any) : Boolean = {
    if (l.isEmpty) return false
    if (l.head == x) return true
    member(l.tail, x)
  }

  def subList(l1:List[Any], l2:List[Any]):Boolean ={
    if (l1.isEmpty) return true
    if (l2.isEmpty) return false
    if (!member(l2, l1.head)) return false
    else return subList(l1.tail, l2)
  }

  def main(args: Array[String]): Unit = {
    var listNum = List(0, 1, 2, 3, 4)
    var listNum1 = List(0, 10, 10, 10, 4)
    var listNum2= List(0, 50, 10, 4, 4, 51)
    println("----Question 03------")
    println(subList(listNum, listNum1))
    println(subList(listNum1, listNum1))
    println(subList(listNum1, listNum2))
    println(subList(listNum2, listNum1))
    println(subList(List(0, 4, 5), listNum2))
    println(subList(List(), listNum2))
    println(subList(List(), List()))
    println(subList(List(0, 4, 5), List()))

  }
}
