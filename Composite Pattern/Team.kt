package composite

class Team : Component {
    private var components = mutableListOf<Component>()

    fun add(component: Component) {
        components.add(component)
    }

    override fun deploy() {
        for(component in components)
            component.deploy()
    }
}