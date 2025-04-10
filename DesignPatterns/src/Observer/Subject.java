package Observer;

public interface Subject {
    void notificarObserver(String message);
    void adicionarObserver(Observer obs);
    void removerObserver(Observer obs);
}
