/**
 * Created by Abhishek on 7/27/2017.
 */
fun main(args: Array<String>) {
    var obj=chandan(A=10,B = 20,C = 30,D = 40)
    obj.method()
    println(obj.str)


}
open class Balu(x:Int)
{
   open var str:String="Hogolo"
   init {
       println("Primary constructor inside the base class")
       println("$x ")
   }
    constructor(x:Int,y:Int):this(x)
    {
        println("Secondary constructor inside the base class")
        println("$x $y")
    }
   open fun method()
    {

        println("M  E T H O D")
    }


}
class chandan(a:Int,b:Int,c:Int):Balu(a,b)
{
  override var  str:String="Barolo"
   init {
       println("Primary constructor inside the Derived class")
       println("$a $b $c")
   }
constructor(A:Int,B:Int,C:Int,D:Int):this(A,B,C)
{
    println("Secondary constructor inside the derived class")
    println("$A $B $C $D")
}
   override fun method() {

       println("M  E T H O D <- Y DID U OVERRIDE ME!")
       super<Balu>.method()
   }

}
