import java.util.*

fun main(){
    val read = Scanner(System.`in`)
    println("Enter your Number: ")
    val a = read.nextInt()
    val b= findValue(a)

    println(b)
}

fun findValue(a:Int):String{
    val res = if(a%2==0){
        "$a is Even"
    }
    else {
        "$a is Odd"
    }
    return res
}