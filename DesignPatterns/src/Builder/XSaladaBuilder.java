package Builder;

public class XSaladaBuilder implements LancheBuilder {
    private Lanche lanche;

    public XSaladaBuilder() {
        this.lanche = new Lanche();
    }

    public void adicionarPao() {
        lanche.setPao("Pão de hambúrguer");
    }

    public void adicionarCarne() {
        lanche.setCarne("Carne bovina");
    }

    public void adicionarQueijo() {
        lanche.setQueijo("Mussarela");
    }

    public void adicionarAlface() {
        lanche.setAlface(true);
    }

    public void adicionarMolho() {
        lanche.setMolho(true);
    }

    public Lanche getLanche() {
        return lanche;
    }
}
