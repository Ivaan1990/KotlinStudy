package module_3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>){
    print(getDaysInYear(2016))
}

fun getDaysInYear(year: Int): Boolean {
    val calendar = GregorianCalendar()
    return calendar.isLeapYear(year)
}