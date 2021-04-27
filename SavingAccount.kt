class SavingAccount(number: String, customer: Customer, balance: Double) : Account(number,customer,balance) {
private var interest = 0.0
    override fun accrue(rate: Double) {
       this.interest += balance * rate
        this.balance += balance * rate
    }

}