package decorator

class Artifact(private var name: String): IArtifact {
    override fun render(): String {
        return name
    }
}