fun main(args: Array<String>){
    print("Введите число 'a' ")
    var a: Int = readLine().toString().toInt()

    print("Введите число 'b' ")
    var b: Int = readLine().toString().toInt()

    var bool: Boolean = a > b
    print(bool)
}