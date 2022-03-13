object Question08 {
  def sumEach(lists:List[List[Int]]) :Int = {
    if (lists.isEmpty) return 0
    var a = 0
    if (lists.head.isEmpty)  a = 0
    else a = (lists.head).head
    return a + sumEach(lists.tail)
  }

  def cutting(lists:List[List[Int]]) : List[List[Int]] = {
    if (lists.isEmpty) return List()     //If using List(List()) --> the result will have 0 append in every solution
    if ((lists.head).isEmpty) return cutting(lists.tail)  //or List(List()) ++ cutting(lists.tail)
    else return List(lists.head.tail) ++ cutting(lists.tail)
  }

  def checkEmpty(lists:List[List[Int]]) : Boolean = {
    if (lists.isEmpty) return true
    if (!(lists.head.isEmpty)) return false
    return checkEmpty(lists.tail)
  }

  def sumAll(lists:List[List[Int]]) :List[Int] = {
    if (checkEmpty(lists)) return List()
    var i = sumEach(lists)
    var newList = cutting(lists)
    return List(i) ++ sumAll(newList)
  }

  def main(args: Array[String]): Unit = {
    println("----Question 08------")
    println(sumAll(List()))
    println(sumAll(List(List())))
    println(sumAll(List(List(), List(), List())))   //!!!??
    println(sumAll(List(List(), List(), List(1))))
    println(sumAll(List(List(1,2,3,4),List(),List(4,5),List(1,2,3,4,5,6))))
    println(sumAll(List(List(3,4),List(1,2,3,4,5,6),List(1,2,3,4))))
    println(sumAll(List(List(1,2,3,4,5,6),List(1,2,3,4),List(1,2),List(0,0,0,0,0,0,0,0,9))))

  }
}
