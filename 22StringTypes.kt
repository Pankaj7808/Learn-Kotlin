fun main(args:Array<String>){
    val s:String = "This is Escaped String\nIt can contain Escape sequence"
    val ss:String = """
    This is raw String \n Escape sequence is not treated
            Pankaj
                        Mandal

        will print same as written
    """
    println(ss)
    println(s)

    val sss:String = "PANKAJ"
    println("Accessing 5th element of String : ${sss[sss.length-1]}")
}
