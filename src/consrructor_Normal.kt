/**
 * Created by Abhishek on 7/27/2017.
 */
fun main(args: Array<String>) {
   var obj=cons1(a=10,b=20)
}
open class cons(x:Int)
{
    init {
        println("Hey u")
    }
    constructor(Y:Int,Z:Int):this(Y)
    {
        println("Ok")
    }
}
class cons1: cons
{

    constructor(a:Int,b:Int):super(a)
}