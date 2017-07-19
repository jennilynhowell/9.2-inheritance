
import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "Sent to your entire address book.";

    public Notification(String subject, String body){
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public void transport () {
        throw new NoTransportException();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void showStatus(){
        System.out.println(this.status);
    }

    protected void messageIsCool(){
        System.out.println("Hey that last message was on-point!");
    }
}
