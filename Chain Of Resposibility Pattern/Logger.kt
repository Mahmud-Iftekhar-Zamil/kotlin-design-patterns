package chainofresposibility

class Logger(next: Handler) : Handler(next) {
    override fun doHandle(request: HttpRequest): Boolean {
        println("Log")
        return false
    }
}