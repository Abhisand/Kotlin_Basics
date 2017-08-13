import java.util.function.Consumer

fun main(args: Array<String>) {
    var values= listOf<Int>(10,25,4,58,25)
    // values.forEach({t-> println(t) }) //Not Mandidatory to use t we can use any name

//    var obj= object :Consumer<Int>
//    {
//        override fun accept(t: Int)
//        {
//            println(t)
//        }
//
//    }
   // values.forEach(obj)
    values.forEach(::println)

}
