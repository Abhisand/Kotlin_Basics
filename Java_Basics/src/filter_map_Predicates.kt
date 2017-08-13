fun main(args: Array<String>) {
    var numbers= listOf<Int>(10,25,14,75,8)
//    for(i in numbers)
//        println(i)
    numbers.forEach({ println(it)}) //{t->println(t)}
    val Mynumber=numbers.find { n->n<10 } //returns the first number which is less than 10
    val MyPredicate={n:Int->n>10}
    val Mynumbers=numbers.all (MyPredicate) //{it>10} Are all the elements are greater than 10
    val Mynumbers1=numbers.any (MyPredicate)//{it>10} Is there any element  greater than 10
    val Mynumber2=numbers.count (MyPredicate) // Counting the no of elements greater then 10


    println("Numbers less than or equall to 10 are: $Mynumber")
    println(" Are all the elements are greater than 10 :$Mynumbers")
    println(" Is there any element  greater than 10 :$Mynumbers1")
    println("Counting the no of elements greater then 10 :$Mynumber2")

}