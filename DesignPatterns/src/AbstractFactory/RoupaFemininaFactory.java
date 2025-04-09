package AbstractFactory;

public class RoupaFemininaFactory implements IRoupaFactory {
    @Override
    public ICalca criarCalca(String cor,String size) {
        return new CalcaFeminina(cor,size);
    }

    @Override
    public ICamisa criarCamisa(String cor,String size) {
        return new CamisaFeminina(cor,size);
    }
}
