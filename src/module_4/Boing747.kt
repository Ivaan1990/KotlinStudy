package module_4
/*
Задание 19: Авиакомпания 3. Наследование
 */
class Boing747() : Aircraft(1000, 20000) {
    override val capacity: Int
        get() = 300

    override fun info(){
        print("Дальность полёта самолета $farAway\nВместимость бака $oilCapacity\nРасход топлива $needFullOil\nВместимость $capacity человек")
    }
}