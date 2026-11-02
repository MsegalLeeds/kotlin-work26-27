// Task 15.2.3: demo program

fun main() {
    var savingsAccount = SavingsAccount("Marc", 1.8 / 1000)
    savingsAccount.deposit(1250)
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.applyInterest()
    savingsAccount.withdraw(50)
    println("Final balance is ${savingsAccount.balance}")
}
