package TemplateMethod;

public class Cafe extends BebidaQuente {
    @Override
    protected void adocar() {
        System.out.println("Adicionando café solúvel.");
    }

    @Override
    protected void adicionarIngredientes(){
        System.out.println("Adicionando 3 colheres de açúcar.");
    }
}
