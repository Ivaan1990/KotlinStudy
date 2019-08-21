package module_3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(){
    //val input: Int = readLine().toString().toInt()
//    getDaysInYear(input)
    val currentDate = Calendar.getInstance()

    val v = currentDate.get(Calendar.MONTH)
/*    val month = currentDate.get(Calendar.MONTH)
    val day = currentDate.get(Calendar.DAY_OF_YEAR)
    print("Год: $v\nМесяц: $month\nДень: $day")
*/
    print(v)
}

fun getDaysInYear(year: Int): LocalDate {
    var currentDate = Calendar.getInstance()
    return LocalDate.parse("12-03-1990", DateTimeFormatter.ofPattern("MM/dd/yyyy"))
}