// Entry point
fun main() {
    // using the :: reference operator to store the "trick" function as a value instead of calling it.
    //val trickFunction = ::trick

    // Now defining the variable again, without the reference operator as "trick" is now stored in a variable.
    val trickFunction = trick
    // Calling the "trick" function normally to get an output.
    trick()
    // Displaying the variable now can be called as if it were a function.
    trickFunction()
    //Calling the 'treat' function showing that is works the same as "trick" due to type inference.
    treat()
}

// Example "trick function"
//fun trick() {
//    println("No treats!")
//}

// Example of the function "trick" now being written as a lambda expression. val varName = {body}
val trick = {
    println("No treats!")
}

// Second example function to display explicitly specifying the functions data type.
val treat: () -> Unit = {
    println("Have a treat!")
}