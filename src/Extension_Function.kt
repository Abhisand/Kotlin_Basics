/**
 * Created by Abhishek on 7/26/2017.
 */
fun main(args: Array<String>) {
    var str1:String="Hey "
    var str2:String=" Hello"
    var str3:String=" Allian"
    var x:Int=5
    var y:Int=10
    var z:Int=15

    println("Max :" +x.Max(y, z))



    println(str1.add(str2, str3))
}
fun String.add(str2:String,str3:String): String //Only an extension function
{
    return this + str2 + str3
}
fun Int.Max(y:Int,z:Int):Int{
    if(this>y && this>z)
        return  this
    else if(y>this && y>z)
        return y
    else
        return z
}
/*All the Infix functions are extension function but revarse is not possible*/