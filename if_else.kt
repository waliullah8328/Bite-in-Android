import java.util.*

fun main(){
    val read = Scanner(System.`in`)
/*
    println("Enter your character : ")
    val ch = read.next().single()

    val result = if(ch in 'a'..'z'){
        println("$ch is a small letter")
    }
    else if(ch in 'A'..'Z'){
        "$ch is capital letter"
    }
    else{
        "$ch is not a smaller letter or capital letter"
    }

     */
    /*val res= when(ch){
        'a'-> "Vowel"
        'e'-> "Vowel"
        'i'-> "Vowel"
        'o'-> "Vowel"
        'u'-> "Vowel"
        'A'-> "Vowel"
        'E'-> "Vowel"
        'I'-> "Vowel"
        'O'-> "Vowel"
        'U'-> "Vowel"
        else->"consonant"
    }
    println(res)

     */
    println("Enter your number : ")
    val ch = read.nextInt()

    val res = when(ch){
        in 1..5->"$ch is between 1 to 5"
        in 6..10->"$ch is between 6 to 10"
        in 11..15->"$ch is between 11 to 15"
        in 15..20->"$ch is between 16 to 20"
        else->"$ch is more than 20 or less than 0"
    }
    println(res)

}