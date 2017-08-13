import java.util.function.Consumer

fun main(args: Array<String>) {
    var values= listOf<Int>(10,25,4,58,25)
   // values.forEach({t-> println(t) })
    values.forEach({ println(it)})
//    var obj= object :Consumer<Int>
//    {
//        override fun accept(t: Int)
//        {
//            println(t)
//        }
//
//    }
}
