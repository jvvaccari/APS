package Decorator;

public class ComLeite extends AdicionalDecorator{

    public ComLeite(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com leite";
    }

    @Override
    public double getValor() {
        return bebida.getValor() + 2.0;
    }
}
