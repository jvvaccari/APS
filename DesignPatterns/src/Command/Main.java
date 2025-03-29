package Command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Television television = new Television();
        Stereo stereo = new Stereo();

        GenericCommand<Light> lightCommand = new GenericCommand<>(light,Light::turnOn,Light::turnOff);
        GenericCommand<Television> televisionCommand = new GenericCommand<>(television,Television::turnOn,Television::turnOff);
        GenericCommand<Stereo> stereoCommand = new GenericCommand<>(stereo,Stereo::turnOn,Stereo::turnOff);

        GenericCommand<Light> changeColorCommand = new GenericCommand<>(light, l -> l.changeColor("Azul"), l -> l.changeColor("Branco"));
        GenericCommand<Television> increaseVolumeCommand = new GenericCommand<>(television, Television::increaseVolume, Television::decreaseVolume);
        GenericCommand<Stereo> increaseStereoVolumeCommand = new GenericCommand<>(stereo, Stereo::increaseVolume, Stereo::decreaseVolume);

        lightCommand.execute();
        System.out.println("Estado da luz: " + light.isState());
        changeColorCommand.execute();
        System.out.println("Cor da luz: " + light.isColor());
        lightCommand.undo();
        System.out.println("Estado da luz: " + light.isState());

        televisionCommand.execute();
        System.out.println("Estado da TV: " + television.isState());
        increaseVolumeCommand.execute();
        increaseVolumeCommand.execute();
        System.out.println("Volume da TV: " + television.getVolume());
        televisionCommand.undo();
        System.out.println("Estado da TV: " + television.isState());

        stereoCommand.execute();
        System.out.println("Estado do estéreo: " + stereo.isState());
        increaseStereoVolumeCommand.execute();
        increaseStereoVolumeCommand.execute();
        System.out.println("Volume do estéreo: " + stereo.getVolume());
        stereoCommand.undo();
        System.out.println("Estado do estéreo: " + stereo.isState());
    }
}