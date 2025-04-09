package AbstractFactory;

public class LojaVirtual {
    private final IRoupaFactory roupaFactory;
    private static LojaVirtual instance;

    private LojaVirtual(IRoupaFactory roupaFactory){
        this.roupaFactory = roupaFactory;
    }

    public static LojaVirtual getInstance(IRoupaFactory roupaFactory){
       if(instance == null){
           instance = new LojaVirtual(roupaFactory);
       }
       return instance;
    }

    public void montarLook(String corCamisa,String tamCamisa,String corCalca,String tamCalca){
        ICamisa camisa = roupaFactory.criarCamisa(corCamisa,tamCamisa);
        ICalca calca = roupaFactory.criarCalca(corCalca,tamCalca);

        System.out.println("Look montado: ");
        camisa.exibir();
        calca.exibir();
    }
}
