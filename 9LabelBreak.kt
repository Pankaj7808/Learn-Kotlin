fun main(args: Array<String>){
    loop@for(i in 1..5){
        for (j in 1..5){
            println("i = $i and j = $j")
            if (i==3){
                break@loop
                //if we had used simply break--> then only inner break will have get terminate..
            }
        }
        println()
    }
}