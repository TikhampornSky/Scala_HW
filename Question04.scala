object Question04 {
  def merge(l1: List[Int], l2: List[Int]):List[Int] = {
    if (l1.isEmpty) return l2
    if (l2.isEmpty) return l1
    if (l1.head < l2.head) return l1.head :: merge(l1.tail, l2)
    else return l2.head::merge(l1, l2.tail)
  }

  def merge_sort(list: List[Int], start: Int, stop: Int):List[Int] ={
    if (start == stop) return List(list(start))
    var m = (start + stop) >> 1
    var list1 = merge_sort(list, start, m)
    var list2 = merge_sort(list, m+1, stop)
    return merge(list1, list2)
  }

  def mergesort(list: List[Int]):List[Int] ={
    if (list.isEmpty) return List()
    return merge_sort(list, 0, list.length - 1)
  }
  def main(args: Array[String]): Unit = {
    println("----Question 04------")
    var listNum = List(0, 1, 2, 3, 4)
    var listNum1 = List(0, 2, 1, 6, 5, 8, 7, 1, 2)
    var listNum2= List(4, 3, 2, 1, -180)
    println(mergesort(listNum))
    println(mergesort(listNum1))
    println(mergesort(listNum2))
  }
}
