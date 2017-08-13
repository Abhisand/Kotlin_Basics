/**
 * Created by Abhishek on 7/27/2017.
 */
fun main(args: Array<String>)
{
var Allian=Allian(5,10,15)
    Allian.show()

}
open class Abhi(var x:Int,var y:Int)
{
 open public fun show()
 {
     println("Inside The Base class")
 }
    init {
        println("Sum of $x and $y IS:${x+y}")
    }



}
class Allian(i: Int, i1: Int,i2:Int) : Abhi(i,i1)
{

    override fun show()
    {

        println("Inside the Deried class")
        super.show() //spetial feature of kotlin bcz in java super call should always be the first instruction
    }
    init {
        println("Sum of $x , $y and $i2 IS:${i+i1+i2}")
    }

}