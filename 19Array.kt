// More constructor of array

fun main(args:Array<String>){
    var arr1:CharArray = charArrayOf('p','a','n','k','a','j')

    var arr2:IntArray = intArrayOf(1,2,3,4)

    var arr3:BooleanArray = booleanArrayOf(false,true,false)

    //longArrayOf, shortArrayOf, byteArrayOf..

    var arr4 = arrayOf<Char>('a','n','i','s','h')

    var arr5 = arrayOf('h','e','l','l','o')
// --------------------------------------------------------------//
    //It is unique than other constructor
    var arr6 = Array<Int>(5,{1})
    // --> arr6 = {1,1,1,1,1}

// we can use lambda expression here
    var arr7 = Array<Int>(5,{i->i*2})

    for (i in arr7){
        print("$i  ")
    }
    
}