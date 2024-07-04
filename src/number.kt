fun main() {
    //Numbers
    val s: Short = 12
    val b: Byte = 120
    val i: Int = -100000000
    val l: Long = 7252987868689
    val f: Float = 7234.234f
    val d: Double = 834957.456456

    // Character
    val letter: Char = 'k'

    // Boolean: Have either true or false
    val flag: Boolean = true

    //Strings
    val stringA: String = "Hello Everyone" //String Literals

    // Concatenation
    val stringB: String = "Hi "
    val stringC: String = "Friends"
    val stringD: String = stringB + stringC

    //String template
    val stringN: String = "Jack"
    val stringK: String = "Hello my name is $stringN"

    //Pair and Triples
    // (x, y)   (x,y,z)

    val coordinates: Pair<Int, Int> = Pair(2, 3)
    val coordinates2 = Pair(2, 3)    //Type interface is normally used in assigning a value
    // to a variable where the Type of the value is not Explicitly stated
    val coordinates3 = 2 to 3       // using "to" operator

    //println("The Coordinates: ${coordinates.first}")
    //println("The Coordinates: ${coordinates.second}")

    val coordinates3D: Triple<Int, Int, Int> = Triple(1, 2, 3)
    val coordinates3D_2 = Triple(3,4, 5)
    println("The 3D coordinates: $coordinates3D")

    val x = coordinates3D.first
    val y = coordinates3D.second
    val z = coordinates3D.third

}