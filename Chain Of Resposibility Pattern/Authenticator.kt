package chainofresposibility

class Authenticator(next: Handler) : Handler(next) {
    override fun doHandle(request: HttpRequest): Boolean {
        println("Authentication")
        //return !(request.username == "admin" && request.password == "1234")
        if (request.username == "admin" && request.password == "1234")
            return false
        else
            return true
    }
}