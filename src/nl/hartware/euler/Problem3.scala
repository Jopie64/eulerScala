package nl.hartware.euler

class Problem3 extends Problem[Int] {
	val number = 13195
	override def answer() : Int = {
	  lazy val prime : Stream[Int] = 2 #:: (Stream.from(3).filter(n => {
	    prime.takeWhile(n2 => n2 * n2 <= n).forall(n2 => n % n2 != 0)}))

	  prime.takeWhile(n => n*n <= number).filter(n => number % n == 0).last
	}
}