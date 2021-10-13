package decorator

class Editor {
    private var artifacts = mutableListOf<IArtifact>()

    fun openProject(path: String) {
        artifacts.add(Artifact("Main"))
        artifacts.add(Artifact("Demo"))
        artifacts.add(Artifact("EmailClient"))
        artifacts.add(Artifact("EmailProvider"))

        artifacts[0] = MainDecorator(artifacts[0])
        artifacts[2] = ErrorDecorator(artifacts[2])

        for(artifact in artifacts)
            println(artifact.render())
    }
}