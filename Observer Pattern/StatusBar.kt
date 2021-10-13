package observer

class StatusBar: IStock {
    private var stocks = mutableListOf<Stock>()

    fun addStock(stock: Stock) {
        stocks.add(stock)
        stock.register(this)
    }

    fun show() {
        println("Status Bar")
        for(stock in stocks) {
            println(stock)
        }
    }

    override fun priceChanged() {
        println("Price Changed - Refreshing StatusBar")
        show()
    }
}