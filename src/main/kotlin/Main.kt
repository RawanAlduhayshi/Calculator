


fun main(args: Array<String>) {
    println("Enter first number")
    var num1 = readLine()!!.toInt()
    println("Enter second number")
   var num2 =readLine()!!.toInt()
    println("Choose one of the operation : + , * , -, / ")
    var operation = readLine()?.get(0)

    if(operation == '/' && num2 == 0){
       println("Error cant divide on ZERO!! \n Please enter another number")
       num2 = readLine()!!.toInt() }

    when(operation){
       '-' -> println("Result is " +(num1 - num2))
       '+' -> println("Result is "+(num1 + num2))
       '*' -> println("Result is "+(num1 * num2))
       '/' -> println("Result is "+(num1 / num2))
   }

}







