fun main(args:Array<String>){
    val res = add(12,31)
    println("Result is $res")
}

// If a function does not returns any value than its return type is Unit. It is optional to specify 

fun add(n1:Int,n2:Int):Int{
    return n1+n2
}