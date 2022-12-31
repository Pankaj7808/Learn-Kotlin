fun main(args:Array<String>){
    val x = Integer.valueOf(readLine())
    if(x%2==0){
        print("$x is even")
    }else{
        print("$x is odd")
    }

    val result = if (x>10) "$x is greater than 10" else "$x is smaller than 10"
    println()
    println(result)
}