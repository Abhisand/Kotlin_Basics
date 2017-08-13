fun main(args: Array<String>) {
        var MyNumbers= listOf<Int>(5,28,4,18,2,14)
   MyNumbers= MyNumbers.filter { v -> v<10 }//{it<10}

    MyNumbers=MyNumbers.map { num -> num*num } //{it*it}
    for(i in MyNumbers)
        println("Square: "+i)
    //Using both filter and map
    MyNumbers=MyNumbers.filter { it<10 }.map { it*it }
    for(i in MyNumbers)
        println("Square: "+i)
}