package chainofresposibility

fun main(args: Array<String>) {
    // Authenticator -> Logger -> Compressor
    var compressor = Compressor(null)
    var log = Logger(compressor)
    var authenticator = Authenticator(log)

    var server = Webserver(authenticator)
    server.handle(HttpRequest("admin","1234"))
}