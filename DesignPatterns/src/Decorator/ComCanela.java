package Decorator;

public class ComCanela extends AdicionalDecorator{
    public ComCanela(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com canela";
    }

    @Override
    public double getValor() {
        return bebida.getValor() + 1.50;
    }
}
