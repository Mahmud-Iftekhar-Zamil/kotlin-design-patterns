package mediator

class ListBox: UIControl() {
    var selection: String = ""
        get() {return field}
        set(value) {
            field = value
            notifyEventHandlers()
        }
}