package module_3

fun main(args: Array<String>){
    fun Double.sqrt(): Double {
        return Math.sqrt(this)
    }
    val d = 16.0
    print(d.sqrt())
}