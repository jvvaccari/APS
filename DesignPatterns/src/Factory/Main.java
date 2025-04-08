package Factory;

public class Main {
        public static void main(String[] args) {
                NotificationFactory factory;

                factory = new EmailNotificationFactory();

                factory.createNotification();

                INotification email = factory.createNotification();

                email.sendMessage("Novo email");

                factory = new SmsNotificationFactory();

                factory.createNotification();

                INotification sms = factory.createNotification();

                sms.sendMessage("Novo sms");
        }
}
