package nl.hartware.euler


class Problem6 extends Problem[Int] {
	val max = 100
	override def answer() : Int = {
	  val allnum = (1 to max).view.sum
	  allnum * allnum - (1 to max).view.map(n => n*n).sum 
	}
}
