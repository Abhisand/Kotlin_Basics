fun main(args: Array<String>) {
    var obj=A()
    obj.sum(25,50)
   // var exp:(Int,Int)->Int={ x:Int,y:Int -> x+y}
//    obj.sum(25,50,object :I{
//      override  fun process(sum:Int)
//        {
//            println("Sum inside the interface $sum")
//        }
//    })
   // obj.sum(10,200,{x,y->x+y}) //OR
    obj.sum(10,20){x,y->x+y}
}
class A
{
    fun sum(x:Int,y:Int)
    {
        var sum=x+y
        println(sum)
    }
    fun sum(x:Int,y:Int,expression:(Int, Int)->Int)
    {
        var sum=expression(x,y)
        println(sum)


    }
    fun sum(x:Int,y:Int,Interface:I)
    {
        var sum=x+y
       Interface.process(sum)

    }
}
interface  I
{
   fun process(sum:Int)
}