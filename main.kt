fun main(){
    val bank = Bank()
    val c = Customer("Ann")
    val ca = CheckingAccount("1001",c,100.00)
    val sa = SavingAccount("1002",c,200.00)
    bank.add(ca)
    bank.add(sa)
    bank.accrue(0.02)
    println(bank.toString())
}