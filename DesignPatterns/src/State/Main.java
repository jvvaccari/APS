package State;

public class Main {
    public static void main(String[] args) {
        MaquinaVenda maquina = new MaquinaVenda();

        maquina.exibirMensagem();
        maquina.inserirMoeda();
        maquina.selecionarProduto("Coca-cola");
        maquina.acionarProduto();
        maquina.inserirMoeda();
        maquina.ejetarMoeda();
    }
}
