import java.util.*

/**
 * Created by Abhishek on 7/24/2017.
 */
fun main(args: Array<String>)
{
    var sc=Scanner(System.`in`)
    print("Enter the value of A:")
    var a=sc.nextInt()
    print("Enter the value of B:")
    var b=sc.nextInt()
    var result=if(a>b)
        a
        else
        b
    println("Gretest Of $a And $b is: $result")


}