fun main(args:Array<String>) {
    // Constants
    val number: Int = 10  // Int: Stores integers
    val pie: Double = 3.24567775 // Double: Stores Decimals
    val k: Float = 6.53F // Float stores minimal length of numbers after the decimal point
    val j: String = "Hello"

    //Constants are variables which it's value doesn't change thus it can't be reassigned another value.

    // Variable
    var variableNumber: Int = 99
    variableNumber = 55
    var personAge: Int = 22
    personAge = 3

    // Type Conversion
    var x: Int = 7
    var y: Double = 3.14

    // x = y // This will result in an ERROR unless we convert the type
    x = y.toInt()
    println(x)


}
