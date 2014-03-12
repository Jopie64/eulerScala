package nl.hartware.euler

import scala.collection.mutable.ListBuffer

object Utils {
    lazy val fibs : Stream[Int] = {
      0 #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
    }

    lazy val primes : Stream[Int] = 2 #:: (Stream.from(3).filter(n => {
	    primes.takeWhile(n2 => n2 * n2 <= n).forall(n2 => n % n2 != 0)}))
	    
	def dividers(n : Int):Map[Int,Int] = {
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
    
  def dayNr(d : Int, m : Int, y : Int) : Int = {
    val yFirstDay = y * 365 + 
    			   (y - 1) / 4 + (if(y > 0) 1 else 0) -//leap years
    			   (y - 1) / 100 + //No leap years in century
    			   (y - 1) / 400   //Except when dividable by 400
    val isLeapYear = y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)
    val mDay = List(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)
    val mFirstDay = mDay(m - 1) + (if(isLeapYear && m > 2) 1 else 0)
    yFirstDay + mFirstDay + d - 1
  }
  
  def weekDay(d : Int, m : Int, y : Int) : Int = {
    (dayNr(d,m,y) - 2) % 7
  }
    
}