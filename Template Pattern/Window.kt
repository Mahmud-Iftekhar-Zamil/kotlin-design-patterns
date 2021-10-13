package template

open class Window {
    fun close() {
        onClosing()
        println("Removing the window from the screen")
        onClosed()
    }

    protected open fun onClosing() {}
    protected open fun onClosed() {}
}