package com.kotinFile

/**
 * Created by Abhishek on 7/25/2017.
 */
fun main(args: Array<String>)
{
    var result= sum(5,20,100)
    println("Result:"+result)
}
@JvmOverloads
fun sum(a:Int,b:Int,c:Int=10):Int=a+b+c