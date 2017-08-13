/**
 * Created by Abhishek on 7/26/2017.
 */
fun main(args: Array<String>) {
    var x:Int=5
    var y:Int=10
    var result=x Min y
    println("Using Infix Function:"+result)
    println("Normal Method: "+x.Min(y))

}
infix fun Int.Min(y:Int):Int //Since its having only one parameter its an infix (even if we are not mentioned exp) and also extension fun
{if(this<y)
    return this
else return y
}