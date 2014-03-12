package nl.hartware.euler


class Problem19 extends Problem[Int] {
	override def answer():Int = {
	  (0 until 1200).filter(n => Utils.weekDay(1, (n%12) + 1, 1901 + n / 12) == 6).length
	}
}
