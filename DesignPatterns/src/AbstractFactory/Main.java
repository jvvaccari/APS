package AbstractFactory;

public class Main {
    public static void main(String[] args){
        IRoupaFactory roupaMasculina = new RoupaMasculinaFactory();
        LojaVirtual loja = LojaVirtual.getInstance(roupaMasculina);

        loja.montarLook("Azul","M","Preta","42");

    }
}
