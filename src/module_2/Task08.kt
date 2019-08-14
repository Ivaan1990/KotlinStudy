package module_2/*
Напишите программу для расчета дохода по вкладу.
Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
Программа выводит в консоль информацию на сколько будет увеличиваться вклад каждый месяц.
 */

fun main(args: Array<String>){
    println("Программа расчета вклада")

    print("введите сумму вклада: ")
    var sum: Int = input()

    print("\nвведите срок (в месяцах): ")
    var months: Int = inputMonth()

    print("\nвведите желаемый процент по вкладу: ")
    var percent: Int = input()

    depositInfo(sum, months, percent)
    print(montlyIncrease(sum, months, percent))
}

fun input(): Int {
    return readLine().toString().toInt()
}

fun depositInfo(sum: Int, months: Int, percent: Int){
    println("\nВы ввели следующие параметры по вкладу:\nсумма $sum\nсрок $months\nпроцент $percent")
}

fun inputMonth(): Int {
    val error: String = "Введено недопустимое значение для срока вклада"
    var months: Int = input()
    if(months < 3) {
        println(error + " '$months'")
        months = 3
    }
    else if(months > 36) {
        println(error + " '$months'")
        months = 36
    }
    return months
}

fun montlyIncrease(sum: Int, months: Int, percent: Int): Int{
    return (sum + sum * percent / 365 / 100) / months
}