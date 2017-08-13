package com.kotinFile

import java.util.*

/**
 * Created by Abhishek on 7/26/2017.
 */
fun main(args: Array<String>)
{

    var sc=Scanner(System.`in`)
    println("Eenter ur Marks:")
    var M:Int=sc.nextInt()
var obj=A()
    if(obj.IsScholar(M))
        println("Congrates U Got The Schlarship!")
    else
        println("U R Not An Allian !")
    println("Enter Ur Age")
    var age:Int=sc.nextInt()
    obj.haspassed(age)
}
fun A.IsScholar(marks:Int):Boolean{
  if(marks>=85)
      return true
    else
      return false
}
class  A
{
    fun haspassed(age:Int):Unit=if(age>=18)println("Eligeble") else print("Not Eligeble")
}