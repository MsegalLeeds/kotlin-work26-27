// Task 13.4: Money class
data class Money(val euros: Int, val cents: Int){
    operator fun plus(other: Money): Money{
        val totalCents =  cents + other.cents
        val extraEuros = totalCents / 100
        val remainingCents = totalCents % 100

        return Money(
            euros + other.euros + extraEuros,
            remainingCents
        )
    }
}