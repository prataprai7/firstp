package com.example.first

//List
fun displayList(){
    val numbers:List<String> = listOf("one","two","three","Four")
    println("Number of elements:${numbers.size}")
    println("third element: ${numbers.get(2)}")
    println("fourth element: ${numbers[3]}")
    println("Index pf element \"two\"${numbers.indexOf("two")}")

}


//Mutable and immutable

fun main() {
    // immutable list
    val lst = listOf("one","tow","three")
    println("Mutable list")
    for (i in lst.indices){
        println(lst[i])
    }
    println()
    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Immutable list")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }
}

//Set
/*fun main(){
    val numbers = setOf(1, 2, 3, 4)
    for(element in numbers){
        println(element)
    }
    val numbersBackwards = setOf (4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
    }*/

//MAP
fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )
    println("All keys : ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
    println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
}

//Task

/*fun main() {
    val dictionary = mapOf(
        "apple" to "a round fruit with red, yellow, or green skin and firm white flesh",
        "book" to "a written or printed work consisting of pages glued or sewn together along one side",
        "computer" to "an electronic device for storing and processing data",
        "dog" to "a domesticated carnivorous mammal that typically has a long snout and barks",
        "elephant" to "a very large herbivorous mammal with a long trunk and tusks"
    )

    println("Welcome to Simple Dictionary!")
    println("Available words: ${dictionary.keys.joinToString(", ")}")

    while (true) {
        print("\nEnter a word to look up (or 'exit' to quit): ")
        val input = readLine()?.trim()?.lowercase()

        when {
            input == null -> continue
            input == "exit" -> {
                println("Goodbye!")
                return
            }
            dictionary.containsKey(input) -> {
                println("\nDefinition of '$input':")
                println(dictionary[input])
            }
            else -> println("Word not found in dictionary. Try another word.")
        }
    }
}*/