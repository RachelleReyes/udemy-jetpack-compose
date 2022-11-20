package com.reyesrachelle.mykotlin

fun main() {
    /**
     * var - mutable
     * val - immutable
     * Best practice - In essence, use val over var
     *
     * val name: String = "James" - explicitly initializing a variable
     */

    val name: String
    val age: Int
    val myByte: Byte
    val myShort: Short
    myByte = 127
    myShort = 128


    name = "James"
    age = 21

    print("Hello my name is $name I'm $age years old.")
    print("$myByte")
    print(myShort)
}

fun longType() {
    val number = 1
    val oneLong = 1L // L is used for long
}

fun floatAndDouble() {
    // Float 32 bits
    // Double 64 bits
    val pi = 3.14 // f for float
    print(pi)

    val e = 2.7182818284
    val eFloat = 2.7182818284f
    print(e)
    print(eFloat)
}

fun operators() {
    val a = 23
    val b = 12
    print(a+b)
    print(a-b)
    print(a*b)
    print(a/b)

    val a2 = 23.0
    val b2 = 12.0
    print(a2/b2)

    val a3 = 10
    val b3 = 5
    print(a3%b3)


}