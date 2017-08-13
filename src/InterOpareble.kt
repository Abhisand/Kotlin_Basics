/**
 * Created by Abhishek on 7/24/2017.
 */
fun main(args: Array<String>)
{
    var obj=Java_Class() //object of java class
    obj.name="Abhishek"
    obj.id=4
    println("Name:${obj.name} Id:${obj.id}")
    obj=Java_Class()//new object with the same name i.e object overriding
    println(obj.id)

}
