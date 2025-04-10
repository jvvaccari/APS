package Observer;

import java.util.ArrayList;
import java.util.List;

public class Steam implements Subject{
    private List<Observer> assinantes = new ArrayList<>();

    @Override
    public void adicionarObserver(Observer obs) {
        assinantes.add(obs);
    }

    @Override
    public void removerObserver(Observer obs) {
        assinantes.remove(obs);
    }

    @Override
    public void notificarObserver(String message){
        for (Observer obs : assinantes) {
            obs.notificar(message);
        }
    }
}
