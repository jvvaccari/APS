package AbstractFactory;

public class CalcaMasculina implements ICalca{
    private String color;
    private String size;

    public CalcaMasculina(String color,String size){
        this.color = color;
        this.size = size;
    }
    @Override
    public void exibir(){
        System.out.println("\nCalça -------\n\n" + "Cor: "+ this.color + " | " + "Tamanho: " + this.size);
    }
}
