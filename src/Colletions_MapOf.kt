fun main(args: Array<String>) {
    var pairs= mapOf<Int,String>(5 to "Hello",1 to "Mr",4 to "Abhi")
   // println(pairs[5])
    for(key in pairs.keys) {
        println(pairs.get(key))
        println("$key  ${pairs[key]}")
    }

}