package mediator

class TextBox: UIControl() {
    var content: String = ""
        get() {return field}
        set(value) {
            field = value
            notifyEventHandlers()
        }
}