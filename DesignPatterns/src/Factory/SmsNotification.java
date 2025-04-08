package Factory;

public class SmsNotification implements INotification{
    public void sendMessage(String message){
        System.out.println("Enviando sms: " + message);
    }
}
