package com.example.first


fun main(args: Array<String>) {
    // From the first snippet: Basic "Hello world" print
    println("Hello world")

    var age = 20
    age = 25
    println("Age: $age")

    val roll = 15

    println("Roll: $roll")

    // From the third snippet: Variables of different types and printing them
    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte = 12
    var d: Short = -356
    var e: Int = 43543
    var f: Long = -51321354L
    var i: Float = 5.6451344F
    var h: Double = 7.326445664

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)

    // From the fourth snippet: Type conversion
    var x: Double = 132.32
    var y: Int = x.toInt()
    var z: Byte = y.toByte()

    println(x)
    println(y)
    println(z)

    // From the fifth snippet: String operations
    var str: String = "Hello world"
    var length: Int = str.length
    var isEqual: Boolean = str.equals("Hello world")
    var username: String = " softwareica "

    println(username.trim())
    println(str)
    println(length)
    println(str.isEmpty())
    println(str.lowercase())
    println(str.uppercase())
    println(isEqual)
    println(str.plus(" How are you?"))
}




