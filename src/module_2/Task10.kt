package module_2

fun main(args: Array<String>){
    val towns = arrayListOf<String>()
    loop@ while(true){
        commandInfo()
        val input: String = readLine().toString()
        when(input.toInt()){
            1 -> {
                print("Введите название города: ")
                val inputTown = readLine().toString()
                towns.add(inputTown)
            }
            2 -> printAllTowns(towns)
            3 -> printAllTownsWithoutRepetition(towns)
            else -> {
                break@loop
            }
        }
    }
}


/**
 * Информация по доступным функциям программы
 */
fun commandInfo(){
    println(
        "Выберите команду:" +
            "\n1 - Добавить название города в программу" +
            "\n2 - Посмотреть в консоли список всех добавленных городов" +
            "\n3 - Посмотреть список добавленных городов без повторений" +
            "\n    Любая другая цифра - Выход из программы"
    )
}

/**
 * Выводим все введённые города в консоль с повторами
 */
fun printAllTowns(towns: List<String>) {
    println("Список всех добавленных городов:")
    for(town in towns){
        println(town)
    }
}

/**
 * Выводим все названия городов без повторов
 */
fun printAllTownsWithoutRepetition(towns: List<String>){
    println("Все введённые города без повторов:")
    val setOfNames: Set<String> = towns.toSet()
    for(name in setOfNames){
        println(name)
    }
}