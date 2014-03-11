package nl.hartware.euler

class Problem5 extends Problem[BigInt] {
	override def answer() : BigInt = {
	  var allDivs = collection.mutable.Map[Int,Int]()
	  for(i <- 2 to 20;
	      j <- Utils.dividers(i)) {
	      var cur = allDivs.getOrElseUpdate(j._1, 0)
	      if(cur < j._2)
	    	  allDivs(j._1) = j._2
	  }
	  allDivs.map(n => math.pow(n._1, n._2).toInt).fold(1)(_ * _)
	}
}