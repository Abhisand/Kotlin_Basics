fun main(args: Array<String>) {
        var values= setOf<Int>(10,20,25,17,10) //Immutable,FixedSize,Read Only
    //setOf and HashSet,mutablesetOf cotains only the unique elements
    for (i in values)
        println(i)
    println()
    var values1= hashSetOf<Int>(10,20,25,17,10) //mutable,size can be varied ,Read and write Oparetions are possible
    //setOf and HashSet cotains only the unique elements
    values1.add(100)
    for (i in values1)
        println(i)

}