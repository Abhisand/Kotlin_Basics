fun main(args: Array<String>) {
    var obj=VIP()
   // obj.StringManupulation("Hello",{str -> str.reversed() })
   // obj.StringManupulation("Hello", String::reversed) // If we had only a single parameter
    obj.StringManupulation("Hello",{it.reversed()}) //Applicable only when we have only one paramenter

}
class VIP
{
   fun StringManupulation(str:String,Function:(String)->String)
   {
       println("Reversed String: "+Function(str))
   }
}