// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main(){
    val birth = LocalDate(2006, 11, 2)
    val person = Person("Marc", birth)
    println(person.age)
}