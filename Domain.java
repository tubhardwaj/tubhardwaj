// Domain/EmailMessage.java

public class EmailMessage {
    private final String recipientEmail;
    private final String subject;
    private final String htmlContent;

    public EmailMessage(String recipientEmail, String subject, String htmlContent) {
        this.recipientEmail = recipientEmail;
        this.subject = subject;
        this.htmlContent = htmlContent;
    }

    // Getters for recipientEmail, subject, and htmlContent
}
