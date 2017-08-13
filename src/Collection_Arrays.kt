import java.util.*

fun main(args: Array<String>) {
    var names=Array<String>(5){"null"}
    names[0]="Abhi"
    names[1]="Chandan"
    names[4]="Balu"

    for( i in 0..names.size-1)
        println("$i     ${names[i]}")

}