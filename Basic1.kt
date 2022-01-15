import java.util.*

fun main(){
    println("Bite In Android")
    println("With Kotlin")
    val read = Scanner(System.`in`)

    /*println("Enter your Name : ")
    val name = readLine()

    println("Enter your Age : ")
    val age = Integer.valueOf(readLine())
    println("Your name is $name and your age is $age")

     */
    println("Enter your name : ")
    val name = read.nextLine()

    println("Enter your age : ")
    val age =read.nextInt()

    println("Your name is $name and age is $age")


}