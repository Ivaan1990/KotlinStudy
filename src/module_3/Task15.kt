package module_3

fun main(args: Array<String>){
    val arr = {mess: Array<String> -> for(str in mess) println(str)}
    val messages: Array<String> = arrayOf("One", "Two", "Three")
    arr(messages)
}