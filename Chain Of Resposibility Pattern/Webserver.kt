package chainofresposibility

class Webserver(private var handler: Handler) {
    fun handle(request: HttpRequest) {
        handler.handle(request)
    }
}