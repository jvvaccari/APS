package State;

public class SemMoedaState implements State {
    private MaquinaVenda maquina;

    public SemMoedaState(MaquinaVenda maquina){
        this.maquina = maquina;
    }

    public void exibirMensagem(){
        System.out.println("A máquina está sem moedas.");
    }

    public void inserirMoeda(){
        System.out.println("Moeda inserida.");
        maquina.setEstadoAtual(maquina.getComMoedaState());
    }

    public void ejetarMoeda(){
        System.out.println("Não há moedas para ejetar.");
    }

    public void acionarProduto(){
        System.out.println("Insira uma moeda primeiro!");
    }
}
