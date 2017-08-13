import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer

fun main(args: Array<String>) {
var obj1=p1(10,20)
 var obj2=obj1.copy(y = 100,x=1000)
    println(obj2)



}
 data class p1(var x:Int,var y:Int) //daa class must have property variables
{
init {
    println("Inside the p1")
}
}
