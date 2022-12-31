fun main(args:Array<String>){
    addNum(10,10)
}

//withou annotation
/* preintRes is lambda expression name which take Int dataType parameter:(Int) and return voidor Unit .. a is the parameter name */

val printRes:(Int)->Unit={a->println(a)} 

fun addNum(a:Int, b:Int):Unit{
    val res = a+b
    //calling lamda expression to print the result
    printRes(res)
}


/* 
20
 */