package Command;

public class Light {
    private boolean state;
    private String color;

    public void turnOn() {
        setState(true);
        System.out.println("A luz foi ligada!");
    }

    public void turnOff() {
        setState(false);
        System.out.println("A luz foi desligada!");
    }

    public void changeColor(String color) {
        this.color = color;
        System.out.println("A cor da luz foi alterada para: " + color);
    }

    public boolean isState() {
        return state;
    }

    public String isColor() {
        return color;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
