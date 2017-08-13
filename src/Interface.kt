fun main(args: Array<String>) {

   var obj=DEMO("AbhiALlian")
    obj.show()
    obj.display()
}
interface Interface{

  fun show()
  {
      println("I am inside the super class interface")
  }
   abstract fun display()
    var name:String



}
interface Interface1
{
    fun show()
    {

        println("Hello Interface1 here!")
    }
}
class  DEMO(override var name: String) :Interface,Interface1{
    override fun display() {
        println("I am inside the display method")
    }

    override fun  show() {
        super<Interface1>.show()
        super<Interface>.show()
        println(name)

    }

}


