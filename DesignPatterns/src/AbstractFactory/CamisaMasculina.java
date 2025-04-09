package AbstractFactory;

public class CamisaMasculina implements ICamisa{
    private String color;
    private String size;

    public CamisaMasculina(String color,String size){
        this.color = color;
        this.size = size;
    }
    @Override
    public void exibir(){
        System.out.println("\nCamisa -------\n\n" + "Cor: "+ this.color + " | " + "Tamanho: " + this.size);
    }
}
