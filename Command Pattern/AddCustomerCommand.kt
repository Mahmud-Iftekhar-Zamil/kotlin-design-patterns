package command

import command.fx.Command

class AddCustomerCommand(private var service: CustomerService): Command {

    override fun execute() {
        service.addCustomer()
    }
}