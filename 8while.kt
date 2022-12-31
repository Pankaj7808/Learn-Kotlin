fun main(args:Array<String>){
    var arr = arrayOf(1,2,3,4)

    var i=-1
    do{
        println("enter a number : ")
        i = Integer.valueOf(readLine())
        arr+=i
    }while(i!=0)

    for (j in arr){
        print(j)
        print(" ")
    }
}