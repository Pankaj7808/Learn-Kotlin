fun main(args:Array<String>){

    /* Lambda is a function which has no name. Lambda is defined with a curly braces {} which takes variable as a parameter (if any) and body of function. The body of function is written after variable (if any) followed by -> operator. */

    val printHello = {println("Hello Pankaj!")}

    //There are two ways to call the lambda expression or function.
    printHello()
    printHello.invoke()
}

/* OUTPUT
Hello Pankaj!
Hello Pankaj!
 */