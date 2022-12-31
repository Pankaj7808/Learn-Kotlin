/* High order function (Higher level function) is a function which accepts function as a parameter or returns a function or can do both. Means, instead of passing Int, String, or other types as a parameter in a function we can pass a function as a parameter in other function. */

fun calculate(a:Int,b:Int,fn:(Int,Int)->Int):Unit{
    val res = fn(a,b)
    println(res)
}
fun main(args:Array<String>){

    //with type annotation
    val mul={a:Int, b:Int -> a*b}

    //without type annotation
    val add:(Int,Int)->Int = {a,b ->  a+b}
    val sub:(Int ,Int)->Int = {a,b->  a-b}
    val div:(Int, Int)->Int={a,b -> a/b}

    calculate(10,10,add)
    calculate(10,10,div)
}

/* 
20
1
 */