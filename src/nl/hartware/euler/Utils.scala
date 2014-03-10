package nl.hartware.euler

object Utils {
    lazy val fibs : Stream[Int] = {
      0 #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
    }

    lazy val primes : Stream[Int] = 2 #:: (Stream.from(3).filter(n => {
	    primes.takeWhile(n2 => n2 * n2 <= n).forall(n2 => n % n2 != 0)}))
}