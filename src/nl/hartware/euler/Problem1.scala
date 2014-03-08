package nl.hartware.euler

class Problem1 extends Problem[Int] {
	override def answer() : Int = {
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