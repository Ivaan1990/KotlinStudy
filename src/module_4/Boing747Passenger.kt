package module_4
/*
 Задание 20: Авиакомпания 4. Интерфейс
 */
class Boing747Passenger : Aircraft(1000, 100000), Passenger {
    override var capacity: Int = 300
}

fun main() {
    val plane = Boing747Passenger()
    print(plane.capacity)
}