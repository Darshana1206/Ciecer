package ucsc

object Cieser {
  def main(args:Array[String]){
    
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	
	val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
	val ciepher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
	var s=scala.io.StdIn.readLine("Secret message: ")
	print("Encrypt by: ")
	var x= scala.io.StdIn.readInt()

	print("Decrypt by: ")
	var y= scala.io.StdIn.readInt()
	
	val Encrypt=ciepher(E,s,x,alphabet)
	val Decrypt=ciepher(D,Encrypt,y,alphabet)
	println(Encrypt)
	println(Decrypt)
	    

  }
}