package nl.hartware.euler

class Problem1 extends Problem[Int] {
	override def answer() : Int = {
	  List.tabulate(999)(n => n+1).filter(n => n % 3 == 0 || n % 5 == 0).fold(0)(_ + _)
	}
	
	//qad = Quick And Dirty
	def answer_qad() : Int = {
	  var sum = 0
	  var i = 0
	  for(i <- 1 to 999) {
	    if(i % 5 == 0 || i % 3 == 0) {
	      sum += i
	    }
	  }
	  sum
	}
}