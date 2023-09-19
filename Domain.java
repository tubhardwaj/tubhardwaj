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


//Gateway   The gateway layer serves as an interface for external services like email sending. Create an interface for your email gateway.
public interface EmailGateway {
    void sendEmail(EmailMessage emailMessage);
}
// Mapper  The mapper layer can be used to map between domain objects and data transfer objects (DTOs). In this case, you may not need a mapper layer unless you want to convert your EmailMessage domain object to a different representation.

//Use Case: The use case layer represents your application's business logic. Create a use case to send an email using the EmailGateway.

// UseCase/SendEmailUseCase.java

public class SendEmailUseCase {
    private final EmailGateway emailGateway;

    public SendEmailUseCase(EmailGateway emailGateway) {
        this.emailGateway = emailGateway;
    }

    public void sendEmail(String recipientEmail, String subject, String htmlContent) {
        EmailMessage emailMessage = new EmailMessage(recipientEmail, subject, htmlContent);
        emailGateway.sendEmail(emailMessage);
    }
}

//The Domain defines the concept of an email message.
//The Gateway provides an interface for sending emails, abstracting the email sending logic.
//The Use Case encapsulates the logic of sending an email using the EmailGateway.
//In your project, you would implement the concrete classes that correspond to these components:

//Domain: If necessary, you can create a EmailMessage class in your domain.

//Gateway: Implement a concrete EmailGateway that uses Akka and the email-sending logic you showed earlier.

// Gateway/ConcreteEmailGateway.java

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class ConcreteEmailGateway implements EmailGateway {
    private final ActorRef emailSenderActor;

    public ConcreteEmailGateway(ActorSystem actorSystem) {
        this.emailSenderActor = actorSystem.actorOf(EmailSenderActor.props(), "emailSenderActor");
    }

    @Override
    public void sendEmail(EmailMessage emailMessage) {
        // Adapt and use the Akka-based email sending logic here
        // Create a SendEmail message and send it to the emailSenderActor
    }
}


    
