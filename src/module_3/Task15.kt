package module_3
/*
Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.
 */

fun main(){
    val arr = {mess: Array<String> -> for(str in mess) println(str)}
    val messages: Array<String> = arrayOf("One", "Two", "Three")
    arr(messages)
}