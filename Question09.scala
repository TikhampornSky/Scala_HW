object Question09 {
  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] = {
    if (n == 0) return tape
    if (tape.isEmpty) return List()
    return List(f(tape.head)) ++ turingStep(f, tape.tail, n-1)
  }

  def f1(a:Char): Char = (a.toString.toLowerCase())(0)
  def f2(a:Char): Char = 'x'

  def main(args: Array[String]): Unit = {
    println("----Question 09------")
    var tape = List('C','H','A','R')
    println(turingStep(f1,tape,2))
    println(turingStep(f1,tape,3))
    println(turingStep(f1,tape,0))
    println(turingStep(f1,tape,5))
    println(turingStep(f1,tape,10000))
    println(turingStep(f2,tape,3))
    println(turingStep(f2,tape,5))
  }
}
