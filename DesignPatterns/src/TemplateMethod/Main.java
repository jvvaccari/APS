package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        BebidaQuente cafe = new Cafe();
        cafe.preparar();

        System.out.println("----------------");

        BebidaQuente cha = new Cha();
        cha.preparar();
    }
}

