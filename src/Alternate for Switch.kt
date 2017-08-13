import java.util.*

/**
 * Created by Abhishek on 7/24/2017.
 */
fun main(args: Array<String>)
{
    var sc=Scanner(System.`in`)
    println("1: One")
    println("2: Two")
    println("3: Three")
    println("Enter ur choice")
    var ch=sc.nextInt()
   var result= when(ch)
    {
        1->"U Selected One"
        2->"U Selected Two"
        3->"U Selected Three"
       else->
               "U R Not An Allian!"

    }
    println("Result: $result")
}