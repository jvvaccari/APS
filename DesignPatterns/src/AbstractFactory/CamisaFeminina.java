package AbstractFactory;

public class CamisaFeminina implements ICamisa {
    private String color;
    private String size;

    public CamisaFeminina(String color,String size){
        this.color = color;
        this.size = size;
    }
    @Override
    public void exibir(){
        System.out.println("\nCamisa -------\n\n" + "Cor: "+ this.color + " | " + "Tamanho: " + this.size);
    }
}
