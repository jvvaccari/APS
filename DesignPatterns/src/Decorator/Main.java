package Decorator;

public class Main {
    public static void main(String[] args){

        Bebida pedido = new CafeSimples("Café simples",10.50);
        pedido = new ComLeite(pedido);
        pedido = new ComCanela(pedido);

        System.out.println("Pedido: " + pedido.getDescricao());
        System.out.println("Total: R$" + pedido.getValor());
    }
}
