package observer

open class ObservableStock {

    private var observers = mutableListOf<IStock>()

    open fun register(obs: IStock) {
        observers.add(obs)
    }

    open fun unregister(obs: IStock) {
        observers.remove(obs)
    }

    open fun notifyOthers() {
        for(obs in observers)
            obs.priceChanged()
    }
}