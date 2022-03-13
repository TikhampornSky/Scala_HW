object Question06 {
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if (list.isEmpty) return List()
    return List(f(list.head)) ++ myMap(f)(list.tail)
  }
  def main(args: Array[String]): Unit = {
    println("----Question 06------")
    var listNum = List(0, 1, 2, 3, 4)
    println(myMap(a => a+10)(listNum))
    println(myMap(a => a*2)(listNum))
  }
}
