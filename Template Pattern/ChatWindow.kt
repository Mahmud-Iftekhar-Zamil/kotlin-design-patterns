package template

class ChatWindow: Window() {
    override fun onClosing() {
        println("Closing server connection...")
    }
}