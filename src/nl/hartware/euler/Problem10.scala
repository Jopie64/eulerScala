package nl.hartware.euler

class Problem10 extends Problem[BigInt] {
	val max = 2000000
	override def answer():BigInt = {
	  Utils.primes.map(n => BigInt(n)).takeWhile(_ < max).sum
	}
}