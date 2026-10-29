// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main(){
    val birth = LocalDate(2006, 11, 2)
    val person = Person("", birth)
    println(person.name)
}