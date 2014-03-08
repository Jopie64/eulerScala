package nl.hartware.euler

class Problem2 extends Problem[Int] {
	override def answer() = {
	  var i = 1
	  var p = 0
	  var answer = 0
	  while(i < 4000000) {
	    if(i % 2 == 0)
	    	answer += i
	    val origI = i
	    i += p
	    p = origI
	  }
	  answer
	}
}