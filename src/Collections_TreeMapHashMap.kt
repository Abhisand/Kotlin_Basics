import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.concurrent.timerTask

/**
 * Created by Abhishek on 7/24/2017.
 */

fun main(args: Array<String>)
{

    var Allians=TreeMap<String,Int>()
    Allians["Abhi"]=100
    Allians["Balu"]=123
    Allians["Chandru"]=150
   println(Allians)
    for((name,age) in Allians)
        println("Name:$name Age:$age")
    println()

    var keys=HashMap<String,Int>()
    keys["Abhi"]=100
    keys["Balu"]=123
    keys["Chandru"]=150
    println(keys)
    for((name,age) in Allians)
        println("Name:$name Age:$age")
    println()
    var bb=TreeSet<Int>()
    bb.add(100)
    bb.add(20)
    println(bb)



}