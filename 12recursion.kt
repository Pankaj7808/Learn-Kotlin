
fun count(n1:Int):Int{
    if (n1!=1){
        return n1*count(n1-1)
    }else{
        return n1
    }
}

fun main(args:Array<String>){
    print("Enter a positive number : ")
    val x = Integer.valueOf(readLine())
    val res = count(x)
    println(res)
}
