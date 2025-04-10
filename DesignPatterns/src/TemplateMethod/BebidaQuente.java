package TemplateMethod;

public abstract class BebidaQuente {
    public final void preparar(){
        ferverAgua();
        adicionarIngredientes();
        adocar();
        servir();
    };

    protected abstract void adicionarIngredientes();

    protected abstract void adocar();

    protected void ferverAgua(){
        System.out.println("Fervendo a água...");
    };

    protected void servir(){
        System.out.println("Servindo a bebida.");
    }
}
