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
}

// Example "trick function"
//fun trick() {
//    println("No treats!")
//}

// Example of the function "trick" now being written as a lambda expression. val varName = {body}
val trick = {
    println("No treats!")
}

