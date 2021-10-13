package observer

class Stock(sym: String, p: Int): ObservableStock() {
private var symbol: String = sym
var price: Int = p
    get() { return field }
    set(value) {
        field = value
        notifyOthers()
    }

    override fun toString(): String {
       return "Stock{ symbol=$symbol, price=$price}"
    }
}