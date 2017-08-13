/**
 * Created by Abhishek on 7/26/2017.
 */
fun main(args: Array<String>) {

  var obj=Box("welcome",10)
  println("Name Inside The class:"+obj.name)
  println("Id Inside the class :"+obj.id)

}
class Box (var name:String)
{
var id:Int=-1
  init {
   // var str:String=name
    println("Student has got a name: $name")
  }
  constructor(name: String,id:Int):this(name)
  {
this.id=id;
  }
}
