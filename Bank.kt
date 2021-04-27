class Bank {
    private var accounts = mutableSetOf<Account>()

    fun add(account:Account){
        accounts.add(account)
    }

    fun accrue(rate:Double){
        for(acc in accounts){
            acc.accrue(rate)
        }
    }

    override fun toString(): String {
       var r =""
        for(acc in accounts){
            r+="$acc \n"
        }
        return r
    }
}