fun main(args: Array<String>) {
    var peoples= listOf<(Person)>(Person("Abhi",5),Person("Chandan",52),Person("Balu",14))
    var names=peoples.map { p -> p.name }
    var NB=peoples.filter {p-> p.name.startsWith("A") } .map { p->p.name }
    var hello=peoples.filter { b -> b.id>10}.map { b->b.id }
    println(hello)
//    for (i in NB)
//        println(i)
    peoples.forEach({ println(it)})
}


class Person(var name:String,var id:Int)
