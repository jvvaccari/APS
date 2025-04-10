package TemplateMethod;

public class Cha extends BebidaQuente{
    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando o saquinho de chá.");
    }

    @Override
    protected void adocar() {
        System.out.println("Adicionando 2 colheres de açúcar.");
    }
}
