package Builder;

public class Main {
    public static void main(String[] args) {
        LancheBuilder builder = new XSaladaBuilder();
        Cozinha cozinha = new Cozinha();

        cozinha.fazerLancheCompleto(builder);

        Lanche lanche = builder.getLanche();
        System.out.println("Lanche pronto com: " + lanche.getPao() + ", " + lanche.getCarne() + ", " + lanche.getQueijo());
    }
}
