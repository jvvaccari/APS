package Factory;

public class SmsNotificationFactory extends NotificationFactory{
    public SmsNotification createNotification(){
        return new SmsNotification();
    }
}
