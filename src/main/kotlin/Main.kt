// Entry point
fun main() {
//    // Defining the "coin" lambda expression, updated to omit the parameter name, symbol, and update the string
//    val coins: (Int) -> String = {
//        "$it quarters"
//    }

//    // Defining the "cupcake" lambda expression
//    val cupcake: (Int) -> String = { //quantity -> (not used, so it's being omitted)
//        "Have a cupcake!"
//    }

    // Creating the two variables needed to store the return values of the "trickOrTreat" function.
    // Omitted the "coins" variable and moved the lambda expression directly into the parameters, Why? No fucking clue.
    // Now we've moved the fucking lambda expression outside the parameters due to it being the last parameter. FoR rEaDaBiLiTy MY ASS.
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    // Calling the two variables above, now in a repeat function
    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

// Define a "trickOrTreat" function and add an if statement that returns the "trick()" function if "isTrick" is true
// and returns the "treat()" function if "isTrick" is false.
// Added the "extraTreat" function type to the parameters
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return (trick)
    } else {
        // Added if statement to only call the function if it isn't null
        if (extraTreat != null) {
            println(extraTreat(5))
        }
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