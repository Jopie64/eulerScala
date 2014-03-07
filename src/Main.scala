object breuk {
  def ggd(aa: Int, bb: Int) : Int = {
    var a = aa
    var b = bb
    
    if(a == 0) return b
    if(b == 0) return a
    if(a < 0) a = -a
    if(b < 0) b = -b
    
    while(a != b) {
      if(a < b) b -= a
      else a -= b
    }
    a
  }
}

class breuk(teller: Int, noemer: Int) {
  var tt = teller
  var nn = noemer
  if (nn < 0) { tt = -tt; nn = -nn; }
  val deler = breuk.ggd(tt,nn)
  
  def t = tt / deler
  def n = nn / deler
  
  override def toString() = "" + t + "/" + n
  
  def +(that: breuk) = {
      val addT = n * that.t;
	  new breuk(t * that.n + addT, n * that.n)
  }
	  
}

object Main extends App {
  
  def voerUit(fun : () => Double) = fun()
  
	override def main(args : Array[String]) = {
	  println("hi all " + voerUit((2).doubleValue) * voerUit(()=>3.1))
	  val b1 = new breuk(2,-4)
	  val b2 = new breuk(5,6)
	  println("breuk: " + b1 + " + " + b2 + " = " + (b1 + b2))
	  
	}
}