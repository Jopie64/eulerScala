import nl.hartware.euler._

class Problem15 extends Problem[BigInt] {
  val (szX,szY) = (BigInt(2),BigInt(3))
  
  def calc(szX: BigInt, szY : BigInt): BigInt = {
    if(szX == 1) return szY;
    (BigInt(1) to szY).view.map(n => calc(szX - BigInt(1), n)).sum
  }
	override def answer():BigInt = {
	  calc(szX,szY)
	}
}

class Problem12 extends Problem[BigInt] {
  def triangle : Stream[BigInt] = {
    return Stream.from(1).map(n => BigInt(n) * (BigInt(n) + BigInt(1)) / BigInt(2))
  }
  
  val target = 30L
	override def answer():BigInt = {
      val first = Math.pow(2,(target - 2).toDouble).toInt;
      println(first)
	  for(i <- triangle; if(i>=first)) {//withFilter(n => n >= first)
	    println(i)
	    val n = Utils.dividers(i).map(_._2).sum + 2
	    if(n == target)
	      return i
	  }
	  throw new Exception("Driehoek nummers zijn op")
	}
}

object Main extends App {
  def oldProblems() = {
	  println("problem1: " + (new Problem1()).answer())
	  println("problem2: " + (new Problem2()).answer())
	  println("problem3: " + (new Problem3()).answer())
	  println("problem5: " + (new Problem5()).answer())
	  println("problem6: " + (new Problem6()).answer())
	  println("problem7: " + (new Problem7()).answer())
	  println("problem8: " + (new Problem8()).answer())
	  println("problem9: " + (new Problem9()).answer())
	  println("problem10: "+ (new Problem10()).answer())
	  println("problem11: "+ (new Problem11()).answer())
	  println("problem13: "+ (new Problem13()).answer())
	  println("problem19: "+ (new Problem19()).answer())
  }
  println("begin...")
  println("problem15: "+ (new Problem15()).answer())
  println("problem12: "+ (new Problem12()).answer())
}
