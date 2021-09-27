fun main() {


    // Inventory
    val inventory = arrayOf(
        arrayOf("Black shirts", "100"),
        arrayOf("White shirts", "0"),
        arrayOf("Orange shirts", "77"),
        arrayOf("Yellow shirts", "88"),
        arrayOf("Blue shirts", "2")
    )


    do {


        // Search
        println("Search")

        val search = readLine()

        // Initialize menu choice
        var choice = 0

        // Loop exit
        var loopIsDone = false



        // Checking inventory
        for (i in inventory) {
            if (i[0] != search) {
                  continue
            }
            if (i[0] == search) {
                println("Item: ${i[0]}\nCount: ${i[1]}\n")
                println("1) Add")
                println("2) Subtract")
                println("3) Exit")
                choice = readLine()!!.toInt()


                // Checking menu choices
                when (choice) {
                    !in 1..3 -> println("Choice out of range\n")
                    1, 2 -> {
                        println("How many?  ")
                        val amount = readLine()!!.toInt()
                        var quantity = i[1].toInt()
                        if (choice == 1) {
                            quantity += amount
                            println("You added $amount $search")
                            println("The item $search had ${i[1]} items and now has $quantity items!\n")
                            loopIsDone = true
                        } else {
                            quantity -= amount
                            println("You subtracted $amount $search")
                            println("The item $search had ${i[1]} items and now has $quantity items!\n")
                            loopIsDone = true
                        }


                    }
                    3 -> loopIsDone = true
                    else -> println("Unknown choice")
                }
            }
        }


    } while (!loopIsDone)
    println("See ya!")


}

