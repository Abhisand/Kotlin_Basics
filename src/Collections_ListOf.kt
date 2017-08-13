fun main(args: Array<String>) {
//    var numbers= listOf<Int>(420,10,25,100,252) //Immutable,FixedSize,Readonly
//    for(i in numbers.sorted())
//        println(i)
//    println()
//    for(i in 0..numbers.size-1)
//        println(numbers[i])
    //using mutable we make it as mutable
    var names= mutableListOf<String>("Abhi","Balu","Boli") //mutable,Read and write ,No fixed size
    names.add("Amar")
    names.add("BB Group")
    names.remove("Amar")
    names.add("Madur")
    names[2]="Chandini" //simply used to override

    for (j in 0..names.size-1)
        println(names[j])
}