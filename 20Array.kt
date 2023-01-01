fun main(args:Array<String>){
    var arr1 = arrayOf<Char>('p','a','n','k','a','j')
    var valueAt1 = arr1.get(1)
    println("arr1 -> $valueAt1")


    print("arr1 = {")
    for (i in 0..5){
/* -->>>> */      print(arr1.get(i))

    if (i==5){
        continue
    }

    print(", ")
    }
    print("}")

/*  OUTPUT
arr1 -> a
arr1 = {p, a, n, k, a, j}
 */


    var arr2 = Array<Int>(5,{0})
    arr2.set(0,2023)

    for (i in 1..4){
        arr2.set(i,i)
    }

    println()
    print("arr2 ->  ")
    //getting element using index
    for (i in 0..4){
        print(arr2[i])
        print(" ")
    }

    val len = arr2.size
    println("Length of arr2 is  $len")



    
}