fun main(args: Array<String>) {
    var pairs= mutableMapOf<Int,String>(5 to "Abhi",24 to "Allian")
    pairs.put(1,"Sand")
   // println(pairs.get(5))
    pairs.remove(5)
    for (key in pairs.keys)
        println(pairs[key])
}