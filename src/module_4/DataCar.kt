package module_4
/*
Задание 23: Data class
 */
data class DataCar(var mark: String, var color: String, var number: Int) {
    fun info(){
        print("Марка $mark\nЦвет $color\n Номер $number")
    }
}

fun main(){
    var car: DataCar = DataCar("Хонда", "Черный", 714)
    print(car.toString())
}