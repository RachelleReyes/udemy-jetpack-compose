package com.reyesrachelle.mykotlin

fun main () {
    /*
        If amount is equal to 1000, then you are wealthy, else you are
        getting by just fine
     */
    val amount = 1000
    if(amount == 1000) {
        print("You are wealthy")
    } else if (amount>=1000) {
        print("Wow... you are very wealthy")
    } else {
        print("You are getting by")
    }

    when(amount) {
        in 1..100 -> print("This amount is between 1 and 100")
        !in 10..90 -> print("This amount is outside the range")
        999 -> print("Really Close")
        1000 -> print("Rich but not there...")
        1100 -> print("You've made it!")
        else -> {
            print("$amount is just not going to work")
        }
    }

    for(i in 1..1000) {
        if (i%3 == 0) {
            println("$i is multiple of 3")
        } else {
            println("---")
        }
    }

}