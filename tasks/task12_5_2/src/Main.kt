// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate


fun main(){
    val birth = LocalDate(2006, 11, 2)
    val person = Person("MArc", birth)
    println(person.name)
}