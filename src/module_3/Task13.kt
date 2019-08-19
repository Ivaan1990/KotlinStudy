package module_3
/*
Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество.
Используйте для этого vararg, из предыдущей темы.
 */

fun main(args: Array<String>){
    print(countEmp("Иван", "Вася", "Петя", "Владимир"))
}

fun countEmp(vararg names: String): Int{
    return names.size
}