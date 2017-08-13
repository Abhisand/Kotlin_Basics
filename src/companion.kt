fun main(args: Array<String>) {
  Helper.show()
}
class Helper
{
  companion  object
    {
       var x:Int=-1
        @JvmStatic
        fun show()
        {
            println("Inside the method show")
        }

    }
}

