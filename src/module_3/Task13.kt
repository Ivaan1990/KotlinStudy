package module_3

fun main(){
    val employe1 = "Ivan"
    val employe2 = "Vasya"
    val employe3 = "Borya"
    print(sumEmployes(employe1, employe2, employe3))
}

fun sumEmployes(vararg names: String):Int {
    return names.size
}