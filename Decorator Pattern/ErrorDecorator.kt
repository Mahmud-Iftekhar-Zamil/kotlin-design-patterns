package decorator

class ErrorDecorator(private var artifact: IArtifact): IArtifact {
    override fun render(): String {
        return "[Error]: ${artifact.render()}"
    }
}