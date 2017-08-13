/**
 * Created by Abhishek on 7/24/2017.
 */
fun main(args: Array<String>)
{
  var nums=10.downTo(1)
    for((i,e) in nums.reversed().withIndex())
        println("$i : $e")

}