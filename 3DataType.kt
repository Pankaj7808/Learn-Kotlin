fun main(args:Array<String>){
    // Number Data Type
    val byte:Byte = 8
    val short:Short = 16
    var integer = 32
    var long:Long = 64
    val float = 32.112
    val double:Double = 64.12133

    // char 
    val char:Char = 'A'

    //String
    val string:String = "Hello"

    //Boolean
    val bool:Boolean = true
// -----------------------------------------------------//
    // Array
    var arr1 = arrayOf(1,2,3,4,5,6,7)
    println(arr1[0])

    val arr2 = Array(5, { i -> i * 2 }) //asc[0,2,4,6,8]  
    println(arr2[arr2.size-1])

}