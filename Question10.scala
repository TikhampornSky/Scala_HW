object Question10 {
  def myFunc(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int], count:Int):Int ={
    if (list.length == 1) return list.head
    var tmp = 0
    if (count%2 == 0) tmp = f1(list.head, (list.tail).head)
    else tmp = f2(list.head, (list.tail).head)
    var newList = List(tmp) ++ (list.tail).tail
    return myFunc(f1, f2, newList, count+1)
  }

  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int ={
    if (list.isEmpty) return 0
    return myFunc(f1, f2, list, 0)
  }

  def f1(x: Int, y:Int): Int = x+y
  def f2(x: Int, y:Int): Int = x-y
  def f3(x: Int, y:Int): Int = x*y

  def main(args: Array[String]): Unit = {
    println("----Question 10------")
    println(alternate(f1, f2, List()))
    println(alternate(f1, f2, List(55)))
    println(alternate(f1, f2, List(1, 2)))
    println(alternate(f1, f2, List(1, 2, 3)))
    println(alternate(f1, f2, List(1, 2, 3, 4)))
    println(alternate(f1, f3, List(1, 0, 3, 4)))
  }
}
