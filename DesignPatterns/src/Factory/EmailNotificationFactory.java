package Factory;

public class EmailNotificationFactory extends NotificationFactory{
    public EmailNotification createNotification() {
        return new EmailNotification();
    }
}
