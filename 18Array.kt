// Array in Kotlin is mutable in nature with fixed size.

fun main(args:Array<String>){
    //1. Creating array
    var arr1 = arrayOf(1,2,3,4,5,67)

    //2.creating array
    var arr2 = arrayOf("Pankaj","shivam","Ankit")

    //It can be also declare as ->
    // var arr2 = arrayOf<String>("Pankaj","shivam","Ankit")


    //Array is mutable. Can we change element of array declare with val keyword.
    val arr3 = arrayOf(100,200,300,400)
    // Yes we can.
    arr3[2]=3000000

    //But we can not reassign the array (any datatype declare with val)
    // arr3 = arrayOf(0,0,0,0,0)

    /* 
    There are more constructor to create an array
     */

}