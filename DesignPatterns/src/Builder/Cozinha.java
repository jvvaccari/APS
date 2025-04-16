package Builder;

public class Cozinha {
    public void fazerLancheCompleto(LancheBuilder builder) {
        builder.adicionarPao();
        builder.adicionarCarne();
        builder.adicionarQueijo();
        builder.adicionarAlface();
        builder.adicionarMolho();
    }
}
