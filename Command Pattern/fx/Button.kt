package command.fx

class Button(private var cmd: Command) {
    fun click() {
        cmd.execute()
    }
}