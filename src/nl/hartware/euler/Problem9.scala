package nl.hartware.euler

class Problem9 extends Problem[Int] {
	val find = 1000
	override def answer():Int = {
	  val max = find - 3
	  for (i <- 1 to max-2;
		   j <- i to max-1;
		   k <- j to max-1) {
	    if(i*i + j*j == k*k && i + j + k == find)
	      return i*j*k
	  }
	  throw new Exception("Not found")
	}
}
