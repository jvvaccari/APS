package AbstractFactory;

public class CalcaFeminina implements ICalca{
    private String color;
    private String size;

    public CalcaFeminina(String color,String size){
        this.color = color;
        this.size = size;
    }
    @Override
    public void exibir(){
        System.out.println("\nCalça -------\n\n" + "Cor: "+ this.color + " | " + "Tamanho: " + this.size);
    }
}
