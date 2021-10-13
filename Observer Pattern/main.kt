package observer

fun main(args: Array<String>) {
    var stock1 = Stock("11",100)
    var stock2 = Stock("22",200)
    var stock3 = Stock("33",300)

    var importantStock = StatusBar()
    importantStock.addStock(stock1)
    importantStock.addStock(stock2)

    var allStocks = StockListView()
    allStocks.addStock(stock1)
    allStocks.addStock(stock2)
    allStocks.addStock(stock3)

    stock1.price = 500


}