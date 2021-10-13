package observer

class StockListView: IStock {
    private var stocks = mutableListOf<Stock>()

    fun addStock(stock: Stock) {
        stocks.add(stock)
        stock.register(this)
    }

    fun show() {
        println("Stock List View")
        for(stock in stocks) {
            println(stock)
        }
    }

    override fun priceChanged() {
        println("Price Changed - Refreshing StockListView")
        show()
    }
}