package Builder;

public interface LancheBuilder {
    void adicionarPao();
    void adicionarCarne();
    void adicionarQueijo();
    void adicionarAlface();
    void adicionarMolho();
    Lanche getLanche();
}
