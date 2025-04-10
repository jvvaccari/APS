package Observer;

public class Gamer implements Observer{
    private String name;

    public Gamer(String name){
        this.name = name;
    }
    @Override
    public void notificar(String message) {
        System.out.println("👾 " + name + " recebeu a notificação: " + message);
    }
}
