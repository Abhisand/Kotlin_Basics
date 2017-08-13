fun main(args: Array<String>) {
    var obj=Myclass()
    obj.Max(10.0f,20.0f,{x1,x2 -> if(x1>x2)  x1 else x2})
}
class Myclass
{
    fun Max(x1:Float,x2:Float,Function:(Float,Float)->Float)
    {
        println("Max: "+Function(x1,x2))
    }



}
