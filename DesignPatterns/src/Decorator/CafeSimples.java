package Decorator;

public class CafeSimples implements Bebida{
    private String desc;
    private double valor;

    public CafeSimples(String desc,double valor){
        this.desc = desc;
        this.valor = valor;
    }

    @Override
    public String getDescricao(){
        return desc;
    };
    @Override
    public double getValor(){
        return valor;
    }
}
