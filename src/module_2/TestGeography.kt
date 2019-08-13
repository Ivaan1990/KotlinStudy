package module_2

fun main(args: Array<String>){
    println("Тест на знание Географии")
    val varOfAnswers = "Введите вариант ответа: "

    println("Россия самая большая страна в мире по площади. Где расположена большая часть территории России?")
    println("1. на востоке Европы и на севере Азии\n2. на юге \n3. на западе")
    print(varOfAnswers)
    var count: Int = 0
    var answer: String = readLine().toString()
    when(answer.toInt()){
        1 -> {
            println("Верно!")
            count += 1
        }
        else -> println("Неверно")
    }

    println("Сколько часовых поясов в России?")
    println("1. 9 часовых поясов\n2. 11 часовых поясов\n3. 4 часовых пояса")
    print(varOfAnswers)
    answer = readLine().toString()
    when(answer.toInt()){
        2 -> {
            println("Верно!")
            count += 1
        }
        else -> println("Неверно")
    }

    println("Сколько субъектов входит в состав РФ ?")
    println("1. 50\n2. 10\n3. 85")
    print(varOfAnswers)
    answer = readLine().toString()
    when(answer.toInt()){
        3 -> {
            println("Верно!")
            count += 1
        }
        else -> println("Неверно")
    }

    println("Сколько стран граничит с Россией?")
    println("1. 18\n2. 20\n3. 12")
    print(varOfAnswers)
    answer = readLine().toString()
    when(answer.toInt()){
        1 -> {
            println("Верно!")
            count += 1
        }
        else -> println("Неверно")
    }

    println("Сколько федеральных округов в России?")
    println("1. 5\n2. 3\n3. 8")
    print(varOfAnswers)
    answer = readLine().toString()
    when(answer.toInt()){
        3 -> {
            println("Верно!")
            count += 1
        }
        else -> println("Неверно")
    }

    gameIsOverShowResult(count)
}

fun gameIsOverShowResult(count: Int){
    when(count){
        in 0..3 -> print("Ваши знания Географии России оцениваются на $count")
        in 3..5 -> print("Отличный результат: $count")
    }
}