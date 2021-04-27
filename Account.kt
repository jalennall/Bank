abstract class Account(number:String,customer:Customer,balance:Double) {
protected val number = number
    protected val customer = customer
    protected var balance = balance



    abstract fun accrue(rate: Double)

    fun balance():Double { return balance }

    fun deposit(amount:Double){balance += amount}

    fun withdraw(amount:Double){balance -= amount }

    override  fun toString():String {
        return "$number: " +  customer.toString() + ": $balance"
    }
}