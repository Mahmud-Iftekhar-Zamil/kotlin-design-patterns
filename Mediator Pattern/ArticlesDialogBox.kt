package mediator

class ArticlesDialogBox {
    private var articleListBox = ListBox()
    private var titleTextBox = TextBox()
    private var saveButton = Button()

    public constructor() {
        articleListBox.addEventHandler { articleSelected() }
        titleTextBox.addEventHandler { titleChanged() }
    }

    public fun simulateUserInteraction() {
        articleListBox.selection = "Article 123"
        articleListBox.selection = ""
        articleListBox.selection = "Article 245"
        println("TextBox = ${titleTextBox.content}")
        println("Button = ${saveButton.isEnabled}")
    }

    private fun articleSelected() {
        titleTextBox.content = articleListBox.selection
        saveButton.isEnabled = true
    }

    private fun titleChanged() {
        saveButton.isEnabled = !(titleTextBox.content.isNullOrEmpty())
    }
}