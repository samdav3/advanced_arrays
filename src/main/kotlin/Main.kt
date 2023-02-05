import kotlin.math.sign

fun main(args: Array<String>) {
    var coffeeshop = arrayOf("Cortado", "Espresso", "Flat White", "Americano", "Drip Coffee")
    var qty = arrayOf("5", "10", "7", "8", "12")

    var combArray = arrayOf<Array<String>>()
    combArray += coffeeshop
    combArray += qty
    var rowCount = combArray[0].size - 1

    println("Your inventory list is as follows:")
        for (i in 0..rowCount) {
            var aitem = combArray[0][i]
            var aqty = combArray[1][i]
            println("$aitem with a quantity of $aqty")
    }
    fun update(){
        var q = print("Please enter an item in your inventory: ").toString()
        q = readLine()!!
        var q1 = q.compareTo(coffeeshop.toString(), true)
        for (i in 0..rowCount) {
            var aitem = combArray[0][i]
            var aqty = combArray[1][i].toInt()
            if (q1 == 0) {
                var count = 0
                var new = print("What would you like the new quantity for $aitem to be?: ").toString()
                new = readLine()!!
                aqty = combArray[1][i].toInt()
                var newval = new
                //var dif =
                println("The old quantity for $aitem was $aqty and the new quantity is $newval.") // The difference between quantities is $dif.
                var more = println("Would you like to update another item in your inventory? (y/n): ").toString()
                more = readLine()!!
                if (more == "y") {
                    update()
                }
            }
        }
    }
    update()
}

