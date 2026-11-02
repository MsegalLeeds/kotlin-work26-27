// Task 15.2.3: SavingsAccount class
class SavingsAccount(holder: String, val rate: Double): BankAccount(holder){
    init {
        require(rate > 0) { "Inerest rate must be > 0" }
    }
    fun applyInterest(){
        deposit((balance + balance * rate).toInt())
    }
}