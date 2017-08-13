/**
 * Created by Abhishek on 7/29/2017.
 */
fun main(args: Array<String>) {
var obj =Derived_class(x=10,y=20)


}
abstract class Abstract_Class(var z:Int)
{
   abstract fun show()
   abstract var name:String
  fun hello()
    {
        println("Hello!")
    }
constructor():this(10)
{
    println("I Am inside the Constructor")
}

}
class Derived_class(var x:Int): Abstract_Class(10)
{


    override var name: String = "Welcome"
    init {
        println("X: $x")
    }


constructor( x:Int,y:Int):this(x)
{
    println("I am inside the secondary constructor")
    println(y)

}

  override  fun  show()
    {
        println("Y did u override me")
    }
}