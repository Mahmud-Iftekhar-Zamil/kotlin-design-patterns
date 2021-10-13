package command

import command.fx.Button

fun main(args: Array<String>) {
//    var service = CustomerService()
//    var cmd = AddCustomerCommand(service)
//    var btnAddCustomer = Button(cmd)
//    btnAddCustomer.click()

    // Example: Composite Command
    var compositeCommand = CompositeCommand()
    compositeCommand.addCommand(BWCommand())
    compositeCommand.addCommand(ResizeCommand())
    compositeCommand.execute()
    compositeCommand.execute()
}