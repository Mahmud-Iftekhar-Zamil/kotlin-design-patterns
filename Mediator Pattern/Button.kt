package mediator

class Button: UIControl() {
    var isEnabled: Boolean = false
        get() {return field}
        set(value) {
            field = value
            notifyEventHandlers()
        }
}