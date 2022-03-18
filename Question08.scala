object Question08 {

  def sumPair(l1:List[Int], l2:List[Int]) :List[Int] = {
    if (l1.isEmpty) return l2
    if (l2.isEmpty) return l1
    return List(l1.head + l2.head) ++ sumPair(l1.tail, l2.tail)
  }

  def sumAll(lists:List[List[Int]]) :List[Int] = {
    if (lists.isEmpty) return List()
    if (lists.length == 1) return lists.head
    var newList = sumPair(lists.head, lists.tail.head)
    return sumAll(newList :: lists.tail.tail)
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
