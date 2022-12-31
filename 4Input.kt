fun main(args:Array<String>){
    println("Enter a Number : ")
    val x = readLine()

    // error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // val y = x.toInt()


    val y = Integer.valueOf(x)

    print(y)

}