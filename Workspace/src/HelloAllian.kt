import java.util.*
import kotlin.collections.HashSet

fun main(args:Array<String>) {
    println("Hello Allian!")
    var values = HashSet<Int>()
    values.add(20)
    values.add(200)
    values.add(2000)
    println(values.filter { p->p>20 })
}