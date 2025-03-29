package Command;

public class Stereo {
    private boolean state;
    private int volume;

    public void turnOn() {
        state = true;
        System.out.println("O estéreo foi ligado!");
    }

    public void turnOff() {
        state = false;
        System.out.println("O estéreo foi desligado!");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Volume do estéreo aumentado para: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Volume do estéreo diminuído para: " + volume);
    }

    public boolean isState() {
        return state;
    }

    public int getVolume() {
        return volume;
    }
}
