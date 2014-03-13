package nl.hartware.euler

class Problem15 extends Problem[BigInt] {
  val (maxX,maxY) = (20,21)
  
  var grid : Array[BigInt] = {
    (0 until maxX * maxY).map(n => BigInt(-1)).toArray
  }
  def calc(szX: Int, szY : Int): BigInt = {
    val a = grid(szY * maxX + szX)
    if(a != -1)
      return a
    
    if(szX == 0) return BigInt(szY + 1);
    
    val newVal = (0 to szY).view.map(n => calc(szX - 1, n)).sum
    grid.update(szY * maxX + szX, newVal)
    newVal
  }
	override def answer():BigInt = {
	  calc(maxX-1,maxY-1)
	}
}
