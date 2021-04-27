class Customer(name: String) {
    private var name = name

    fun Customer(name: String){
        this.name = name
    }
    override fun toString():String {return name}
}