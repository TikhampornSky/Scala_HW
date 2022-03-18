object Question05 {
  def myFunc(list: List[Any], l: Int, r: Int):Boolean ={
    if (l > r) return true
    if (list(l) == list(r)) return myFunc(list, l+1, r-1)
    else return false
  }

  def palindrome(list: List[Any]):Boolean ={
    return myFunc(list, 0,list.length - 1)
  }

  def main(args: Array[String]): Unit = {
    println("----Question 05------")
    var listNum = List(0, 1, 2, 3, 4)
    var listNum1 = List(1, 1, 2, 2, 1, 1)
    var listNum2= List(1, 1, 2, 3, 2, 1, 1)
    println(palindrome(listNum))
    println(palindrome(listNum1))
    println(palindrome(listNum2))
    println(palindrome(List("1", 2, 1)))
    println(palindrome(List()))
  }
}
