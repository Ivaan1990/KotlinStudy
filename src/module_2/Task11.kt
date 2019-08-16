package module_2

fun main() {
    val map: Map<Int, String> = mutableMapOf(
        0 to "Иван Иванович Иванов",
        1 to "Петр Петрович Петров",
        2 to "Василий Васильевич Васин"
    )
    print("Введите номер сотрудника, ФИО которого вы хотите узнать: ")
    while(true){
        try {
            val input = readLine().toString().toInt()
            if (input >= map.size){
                println("Несуществующий номер")
            }
            else {
                getNameOfEmployee(input, map)
            }
            println("Введите любой символ чтобы выйти из программы, или повторите ввод цифры:")
        }
        catch (ex: NumberFormatException){
            print("Программа завершена")
            break
        }
    }
}

fun getNameOfEmployee(key: Int, map: Map<Int, String>){
    println("Вы ввели $key, под этим номером числится ${map.getValue(key)}")
}