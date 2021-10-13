package decorator

class MainDecorator(private var artifact: IArtifact): IArtifact {
    override fun render(): String {
        return "[Main]: ${artifact.render()}"
    }
}