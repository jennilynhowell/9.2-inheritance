/**
 * Created by jennilynhowell on 7/19/17.
 */
public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.messageIsCool();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        //super.transport();
        System.out.println("To: " + this.getRecipient());
        System.out.println("Subject: " + this.getSubject());
        System.out.println("Body: " + this.getBody());
        System.out.println("Created: " + this.getCreatedAt());
    }
}
