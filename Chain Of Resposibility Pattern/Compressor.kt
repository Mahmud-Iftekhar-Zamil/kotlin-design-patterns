package chainofresposibility

class Compressor(next: Handler?) : Handler(next) {
    override fun doHandle(request: HttpRequest): Boolean {
        println("Compression")
        return false
    }
}