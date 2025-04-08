package Factory;

public class EmailNotification implements INotification{
    public void sendMessage(String message){
        System.out.println("Enviando email: " + message);
    }
}
