// with the annotation in lambda 
val sum = {n1:Int,n2:Int -> n1+n2}
// without the annotation 
// --> multiply -> name, (Int,Int)-> parameter type, -> Int return type ={function body}
val multiply:(Int,Int) -> Int= {a,b -> a*b}

fun main(args:Array<String>){
    println(sum(12,13))
    println(multiply(10,10))
}



/* 
25
100
 */