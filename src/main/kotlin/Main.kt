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
                var add = 'a'
                var remove = 'r'
                var method = print("Would you like to add or remove from your inventory for $aitem? (a/r): ")
                if (method.equals(add)) {
                    var new = print("How many would you like to add to the quantity of $aitem?: ").toString()
                    new = readLine()!!
                    aqty = combArray[1][i].toInt()
                    var newval = aqty + new.toInt()
                    println("The old quantity for $aitem was $aqty and the new quantity is $newval.") // The difference between quantities is $dif.
                    var more = println("Would you like to update another item in your inventory? (y/n): ").toString()
                    more = readLine()!!
                    if (more == "y") {
                        update()
                    }
                }else if (method.equals(remove)){
                    var new = print("How many would you like to remove from the quantity of $aitem?: ").toString()
                    new = readLine()!!
                    aqty = combArray[1][i].toInt()
                    var newval = aqty - new.toInt()
                    if (newval < 0){
                        println("If you remove $new from teh quantity of $aitem, your inventory will be negative. Please try a different number.")
                        update()
                    }else{
                        println("The old quantity for $aitem was $aqty and the new quantity is $newval.") // The difference between quantities is $dif.
                        var more = println("Would you like to update another item in your inventory? (y/n): ").toString()
                        more = readLine()!!
                        if (more == "y") {
                            update()
                        }
                    }
                }else{
                    println("Please enter a valid entry (a/r).")
                    update()
                }

            }
        }
    }
    update()
}

