package AbstractFactory;

public class RoupaMasculinaFactory implements IRoupaFactory {
    @Override
    public ICalca criarCalca(String cor,String size) {
        return new CalcaMasculina(cor,size);
    }

    @Override
    public ICamisa criarCamisa(String cor,String size) {
        return new CamisaMasculina(cor,size);
    }
}
