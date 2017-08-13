/**
 * Created by Abhishek on 7/25/2017.
 */

fun main(args: Array<String>) {
   ownName@ for(i :Int in 1..5)
    {

        for (j: Int in 1..5) {
            if ( j == 5)
                continue@ownName
            print("$j ")
        }

    }
}