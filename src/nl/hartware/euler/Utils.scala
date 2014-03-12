package nl.hartware.euler

import scala.collection.mutable.ListBuffer

object Utils {
    lazy val fibs : Stream[Int] = {
      0 #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
    }

    lazy val primes : Stream[Int] = 2 #:: (Stream.from(3).filter(n => {
	    primes.takeWhile(n2 => n2 * n2 <= n).forall(n2 => n % n2 != 0)}))
	    
	def dividers(n : BigInt):Map[Int,Int] = {
      var divs = collection.mutable.Map[Int,Int]()
      var left = n
      for(i <- primes) {
        if(i > left)
          return divs.toMap
        while(left % i == 0) {
          left /= i
          divs(i) = divs.getOrElseUpdate(i, 0) + 1
        }
      }
      throw new Exception("Primes zijn op")
    }
}