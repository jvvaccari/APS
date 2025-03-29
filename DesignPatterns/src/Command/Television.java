package Command;

public class Television {
    private boolean state;
    private int volume;

    public void turnOn() {
        state = true;
        System.out.println("A televisão foi ligada!");
    }

    public void turnOff() {
        state = false;
        System.out.println("A televisão foi desligada!");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Volume da televisão aumentado para: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Volume da televisão diminuído para: " + volume);
    }

    public boolean isState() {
        return state;
    }

    public int getVolume() {
        return volume;
    }
}