package adaptar

import adaptar.Gmail.GmailClient

fun main(args: Array<String>) {
    var emailClient = EmailClient()
    emailClient.add(YahooProvider())
    emailClient.add(GmailProvider(GmailClient()))
    emailClient.downloadEmails()
}