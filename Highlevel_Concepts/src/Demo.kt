fun main(args: Array<String>) {
    val obj=program()
    obj.addTwoNumbers(10,20)
    obj.addTwoNumbers(10,20, object : MyInterface {
      override  fun execute(sum:Int)
      {
          println(sum)
      }
    })
}
class program
{
    fun addTwoNumbers(a:Int,b:Int)
    {
        var sum:Int=a+b
        println(sum)
    }
    fun addTwoNumbers(a:Int,b:Int,action:MyInterface)
    {
        var sum:Int=a+b
        action.execute(sum)
    }
}
interface  MyInterface
{
    fun execute(sum:Int)
}