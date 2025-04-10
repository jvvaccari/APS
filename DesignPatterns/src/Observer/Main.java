package Observer;

public class Main {
    public static void main(String[] args) {
        Steam client = new Steam();

        Gamer g1 = new Gamer("João");
        Gamer g2 = new Gamer("Emanuelle");

        client.adicionarObserver(g1);
        client.adicionarObserver(g2);

        client.notificarObserver("Novo jogo disponível: Elden Ring 2!");
    }
}
