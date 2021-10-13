package command

import command.fx.Command

class ResizeCommand: Command {
    override fun execute() {
        println("Resizing...")
    }
}