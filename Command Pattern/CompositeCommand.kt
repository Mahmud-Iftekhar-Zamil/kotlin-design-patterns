package command

import command.fx.Command

class CompositeCommand: Command {
    private var commands = mutableListOf<Command>()

    fun addCommand(command: Command) {
        commands.add(command)
    }

    override fun execute() {
        for (cmd in commands) {
            cmd.execute()
        }
    }
}