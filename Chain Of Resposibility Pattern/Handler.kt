package chainofresposibility

abstract class Handler(private var next: Handler?) {
    fun handle(request: HttpRequest) {
        if(doHandle(request)) return
        if(next != null) next?.handle(request)
    }
    abstract fun doHandle(request: HttpRequest): Boolean
}