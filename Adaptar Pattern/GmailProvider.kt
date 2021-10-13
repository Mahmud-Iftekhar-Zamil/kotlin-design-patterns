package adaptar

import adaptar.Gmail.GmailClient

class GmailProvider(private var gmailClient: GmailClient): EmailProvider {
    override fun downloadEmails() {
        gmailClient.connect()
        gmailClient.getEmails()
        gmailClient.disconnect()
    }
}