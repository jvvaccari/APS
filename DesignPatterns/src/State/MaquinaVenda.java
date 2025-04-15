package State;

public class MaquinaVenda {
    private State semMoedaState;
    private State comMoedaState;
    private State vendendoProdutoState;

    private State estadoAtual;

    private String produtoSelecionado;

    public MaquinaVenda(){
        semMoedaState = new SemMoedaState(this);
        comMoedaState = new ComMoedaState(this);
        vendendoProdutoState = new VendendoProdutoState(this);

        estadoAtual = semMoedaState;
    }

    public void inserirMoeda(){
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda(){
        estadoAtual.ejetarMoeda();
    }

    public void acionarProduto(){
        estadoAtual.acionarProduto();
    }

    public void exibirMensagem(){
        estadoAtual.exibirMensagem();
    }

    public State getSemMoedaState() {
        return semMoedaState;
    }

    public State getComMoedaState() {
        return comMoedaState;
    }

    public State getVendendoProdutoState() {
        return vendendoProdutoState;
    }

    public void setEstadoAtual(State estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void selecionarProduto(String produto) {
        this.produtoSelecionado = produto;
    }

    public String getProduto() {
        return produtoSelecionado;
    }
}
