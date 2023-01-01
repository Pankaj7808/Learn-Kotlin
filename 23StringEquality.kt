fun main(args:Array<String>){
    // Equality of string
    val s1 = "Pankaj"
    var s2 = "Mandal"
    val s3 = "Pankaj"

    println(s1==s2)  //false
    println(s1==s3)  //true
    println(s1==s1)   //true

    println(s1===s3) //true
    println(s1===s3) //true

    //buildstring is a method which return a string object
     val a = buildstring("pankaj")
     val b = buildstring("pankaj")

     //a==b    ->true
     //a===b   -> false



    val s = charArrayOf('p','a','n')
    val ss = charArrayOf('p','a','n')

    println("s=${String(s)}   ss=${String(s)}")
    println("${String(s)===String(ss)}") //false
    println("${String(s)==String(ss)}") //true
    // a === b specifies true if and only if a and b both point to the same object.



}