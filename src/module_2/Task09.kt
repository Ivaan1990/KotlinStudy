package module_2

fun main(args: Array<String>){
    val table: Array<Array<String>> = Array(3, {Array(3,{""})})
    table[0] = arrayOf("Россия", "США", "Канада")
    table[1] = arrayOf("Москва", "Вашингтон", "Оттава")
    table[2] = arrayOf("Рубли", "Доллары", "Канадский доллар")

    println("Страна Столица Валюта\t")
    var countRow = 0
    var countCell = 0
    for(row in table){
        for(cell in row){
            var elem = table[countCell++][countRow]
            print("$elem\t")
        }
        countRow++
        countCell = 0
        println()
    }
}