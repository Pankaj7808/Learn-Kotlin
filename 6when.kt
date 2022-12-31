fun main(args:Array<String>){
    println("Enter any Number : ")
    val x = Integer.valueOf(readLine())
    val result = when(x){
        1,3,5,7,8,10,12 -> 31
        4,6,9,11 -> 30
        2->28
        else-> "Invalid Input"
    }
    println(result)
}