object Question07 {
  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    if (list.isEmpty) return List()
    if (f(list.head)) return List(list.head) ++ myFilter(f)(list.tail)
    else return myFilter(f)(list.tail)
  }

  def main(args: Array[String]): Unit = {
    println("----Question 07------")
    var listNum = List(1, 2, 3, 4, 5)
    println(myFilter(x => x%2 == 0)(listNum))
    println(myFilter(x => x < 3)(listNum))
    println(myFilter(x => x > 500000)(listNum))
    println(myFilter(x => x > 0)(listNum))
  }
}
