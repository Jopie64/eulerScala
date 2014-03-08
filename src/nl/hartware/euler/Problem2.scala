package nl.hartware.euler

class Problem2 extends Problem[Int] {

	override def answer() = {
	    lazy val fibs : Stream[Int] = {
	      0 #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
	    }
    	fibs.view.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum
	}

	def answer_qad() = {
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