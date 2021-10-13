package adaptar

class EmailClient: EmailProvider {
    private var emailProviders = mutableListOf<EmailProvider>()

    fun add(emailProvider: EmailProvider) {
        emailProviders.add(emailProvider)
    }

    override fun downloadEmails() {
        for(provider in emailProviders)
            provider.downloadEmails()
    }
}