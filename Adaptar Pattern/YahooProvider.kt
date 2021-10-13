package adaptar

class YahooProvider: EmailProvider {
    override fun downloadEmails() {
        println("Downloading emails from Yahoo!")
    }
}