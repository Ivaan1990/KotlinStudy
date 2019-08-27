package module_3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>){
    if(infoLeapYear(2017))
        print("Высокосный год")
    else
        print("Не высокосный год")
}

fun infoLeapYear(year: Int): Boolean {
    val calendar = GregorianCalendar()
    return calendar.isLeapYear(year)
}