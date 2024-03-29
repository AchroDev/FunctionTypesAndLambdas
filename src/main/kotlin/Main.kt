// Entry point
fun main() {
    // Creating the two variables needed to store the return values of the "trickOrTreat" function.
    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)
    // Calling the two variables above
    treatFunction()
    trickFunction()
}

// Define a "trickOrTreat" function and add an if statement that returns the "trick()" function if "isTrick" is true
// and returns the "treat()" function if "isTrick" is false.
fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return (trick)
    } else {
        return (treat)
    }
}

// Example of the function "trick" now being written as a lambda expression. val varName = {body}
val trick = {
    println("No treats!")
}

// Second example function to display explicitly specifying the functions data type.
val treat: () -> Unit = {
    println("Have a treat!")
}