package module_4
/*
Задание 17: Авиакомпания 1

Задание 18: Авиакомпания 2. Конструктор
 */

abstract class Aircraft(farAway: Int, oilCapacity: Int): Passenger {
    protected val farAway: Int = farAway
    protected val oilCapacity: Int = oilCapacity

    protected var needFullOil: Double = 0.0
        get() = (farAway / oilCapacity).toDouble()

    internal open fun info(){
        print("Дальность полёта самолета $farAway\nВместимость бака $oilCapacity\nРасход топлива $needFullOil")
    }
}