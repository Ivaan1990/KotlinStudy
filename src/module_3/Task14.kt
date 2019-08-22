 package module_3

fun main(args: Array<String>){
    val empName: String = "Иван Иваныч Иванов"
    val position: String = "Слесарь"
    val age: Int = 30
    val marital: String = "Женат"

    infoEmploye(empName, position)
    infoEmploye(empName, age, position)
    infoEmploye(empName, marital, position)
    infoEmploye(empName, age, marital, position)
}

fun infoEmploye(name: String, position: String){
    println("ФИО:$name\nДолжность:$position")
}

fun infoEmploye(name:String, age:Any?, position: String){
    println("ФИО:$name\nВозраст:$age\nДолжность:$position")
}

fun infoEmploye(name:String, marital: String, position: String){
    println("ФИО:$name\nСемейное положение:$marital\nДолжность:$position")
}

fun infoEmploye(name:String, age: Any?, marital: String, position: String){
    println("ФИО:$name\nВозраст:$age\nСемейное положение:$marital\nДолжность:$position")
}