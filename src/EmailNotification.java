/**
 * Created by jennilynhowell on 7/19/17.
 */
public class EmailNotification extends Notification {
    //default constructor cannot take arguments; this is why I'm seeing the error.

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "Sent to Mom.";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        //super.transport();
        System.out.println("To: " + this.getRecipient());
        System.out.println("Subject: " + this.getSubject());
        System.out.println("Body: " + this.getBody());
        System.out.println("Created: " + this.getCreatedAt());
    }

    @Override
    public void messageIsCool() {
        super.messageIsCool();
        System.out.println("Baddest email ever written.");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected EmailNotification clone() throws CloneNotSupportedException {
        String newSubject = this.getSubject();
        String newBody = this.getBody();
        String newRecepient = this.getRecipient();
        String newSmtpProvider = this.getSmtpProvider();
        EmailNotification emailClone = new EmailNotification(newSubject, newBody, newRecepient, newSmtpProvider);

        return emailClone;
    }
}
