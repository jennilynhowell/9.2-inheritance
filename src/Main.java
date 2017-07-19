public class Main {

    public static void main(String[] args) {

        EmailNotification email = new EmailNotification("Bunnies", "There's a big bunny that lives in my backyard. You should come see it!", "Mom", "1234.com");

        TextNotification text = new TextNotification("Dinner", "What's for dinner?", "William", "Verizon");

        email.transport();
        text.transport();

        email.showStatus();
        text.showStatus();

        email.messageIsCool();

        EmailNotification emailNotificationClone = null;
        try {
            emailNotificationClone = email.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(email.equals(emailNotificationClone));

        //are these not equal because their createdAt dates are different?
        System.out.println(email.getCreatedAt());
        System.out.println(emailNotificationClone.getCreatedAt());


    }
}
