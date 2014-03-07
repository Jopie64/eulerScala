object Breuk {
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

case class Breuk(teller: Int, noemer: Int) {
  var tt = teller
  var nn = noemer
  if (nn < 0) { tt = -tt; nn = -nn; }
  val deler = Breuk.ggd(tt,nn)
  
  def t = tt / deler
  def n = nn / deler
  
  //def breuk(teller: Int) : breuk = breuk(teller, 1)
  
  override def toString() = "" + t + "/" + n
  
  def +(that: Breuk) = {
      val addT = n * that.t;
	  new Breuk(t * that.n + addT, n * that.n)
  }
	  
}

object Main extends App {
  
  def voerUit(fun : () => Double) = fun()
  
	override def main(args : Array[String]) = {
	  println("hi all " + voerUit((2).doubleValue) * voerUit(()=>3.1))
	  val b1 = Breuk(2,-4)
	  val b2 = Breuk(5,6)
	  println("breuk: " + b1 + " + " + b2 + " = " + (b1 + b2))
	  val c1 = { case "x" => Breuk(3,5)
	  	 		 case "y" => new Breuk(2,3)} : String => Breuk
	  	 		 
	  println("case: " + c1("x"))
	  
	}
}