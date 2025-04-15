package State;

public class VendendoProdutoState implements State{
    private MaquinaVenda maquina;

    public VendendoProdutoState(MaquinaVenda maquina){
        this.maquina = maquina;
    }

    public void exibirMensagem(){
        System.out.println("Muito obrigado pela compra.");
        maquina.setEstadoAtual(maquina.getSemMoedaState());
    }

    public void inserirMoeda(){
        System.out.println("Moeda inserida.");
        maquina.setEstadoAtual(maquina.getComMoedaState());
    }

    public void ejetarMoeda(){
        System.out.println("Não há moedas para ejetar.");
    }

    public void acionarProduto(){
        System.out.println("Produto acionado.");
    }
}
