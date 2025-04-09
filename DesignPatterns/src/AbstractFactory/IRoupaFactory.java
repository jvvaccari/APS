package AbstractFactory;

public interface IRoupaFactory {
    ICamisa criarCamisa(String cor,String size);
    ICalca criarCalca(String cor,String size);
}
