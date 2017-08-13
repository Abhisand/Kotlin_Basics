/**
 * Created by Abhishek on 7/25/2017.
 */
@file:JvmName("ConventionalName")

package com.kotinFile

import com.JavaClass.Dummy

fun main(args: Array<String>)
{
var obj= Dummy()
   var result=obj.max(5,100)
   println("Interoparebality Result of Max:"+result)
}
fun min(a:Int,b:Int):Int=if(a<b)a else b

