/**
 * Created by Abhishek on 7/25/2017.
 */
fun main(args: Array<String>) {
   println(add(2,3))
    println(Max(2,3))
}
fun add(a:Int,b:Int):Int
{
return a+b
}
fun Max(a:Int,b:Int):Int=if(a>b)a else b