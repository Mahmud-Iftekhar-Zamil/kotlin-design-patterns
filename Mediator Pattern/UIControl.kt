package mediator

abstract class UIControl {
    private var eventHandlers = mutableListOf<EventHandler>()

    fun addEventHandler(eventHandler: EventHandler) {
        eventHandlers.add(eventHandler)
    }

    protected fun notifyEventHandlers() {
        for(eventHandler in eventHandlers)
            eventHandler.handle()
    }
}