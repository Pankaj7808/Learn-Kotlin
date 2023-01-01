fun main(args:Array<String>){
    val c:CharArray = charArrayOf('p','a','n','k','a','j')
    //coverting it to String
    println("CharArray to String -> $String(c)")

/* OUTPUT
     CharArray to String -> kotlin.jvm.internal.StringCompanionObject@1b6d3586(c)

    Why? -> Acutally function work fine but.. String template must have touse with curly braces
            to evaluate an expression.
            String template starts with $ sign which may contain variable name or any expression(must be in curly braces)
*/
    println("CharArray to String -> ${String(c)}")

    val name = "Pankaj"

    val nameInArr:CharArray = name.toCharArray()

    //CharArray which is converted to string gives a string
    //Array define with constructor gives address of the array
    println(nameInArr)


}