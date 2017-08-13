import java.math.BigInteger

/**
 * Created by Abhishek on 7/26/2017.
 */
fun main(args: Array<String>) {

    println(fibo(10000, BigInteger("0"),BigInteger("1")))
}
tailrec fun fibo(n:Int,f1:BigInteger,f2:BigInteger):BigInteger{
    if(n==1)
        return f1
    return fibo(n-1,f1+f2,f1)
}
//0 1 1 2 3 5 8 13