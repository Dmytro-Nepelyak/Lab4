package computer;

public class Bluetoothmouse extends Periphery {
    public Bluetoothmouse(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println(name + " підключена через Bluetooth");
    }
}
