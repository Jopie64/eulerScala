package nl.hartware.euler

trait Problem[TAnswer] {
	def answer() : TAnswer
}