/**
 * Created by Abhishek on 7/24/2017.
 */
fun main(args: Array<String>)
{
 var obj=A()
    obj.name=null
    println("Object Name: ${obj.name}")
}
class A
{
  var name:String?="" //if we remove ? kotlin won't allow u to assign null value
}