fun main(args: Array<String>) {
    val obj=program1()
    obj.addTwoNumbers(10,20)
    val Mylamda:(Int) -> Unit={s:Int -> println("Sum Inside Lamda:"+s) }

    obj.addTwoNumbers(10,20,Mylamda)
}
class program1
{
    fun addTwoNumbers(a:Int,b:Int)
    {
        var sum:Int=a+b
        println(sum)
    }
    fun addTwoNumbers(a:Int,b:Int,action:(Int) -> Unit)
    {
        var sum:Int=a+b
        action(sum)
    }
}
interface  MyInterface1
{
    fun execute(sum:Int)
}