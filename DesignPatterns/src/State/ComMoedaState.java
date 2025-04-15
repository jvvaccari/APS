package State;

public class ComMoedaState implements State{
    private MaquinaVenda maquina;

    public ComMoedaState(MaquinaVenda maquina){
        this.maquina = maquina;
    }

    public void exibirMensagem(){
        System.out.println("Bem vindo,deseja comprar algo?.");
    }

    public void inserirMoeda(){
        System.out.println("Já existe uma moeda inserida.");
    }

    public void ejetarMoeda(){
        System.out.println("Ejetando moeda.");
    }

    public void acionarProduto(){
        System.out.println("Acionando o produto selecionado: " +  maquina.getProduto());
        maquina.setEstadoAtual(maquina.getVendendoProdutoState());
    }
}
