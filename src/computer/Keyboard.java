package computer;

public class Keyboard extends Periphery {
    public Keyboard(String name) {
        super(name);
    }

    @Override
    public void connect() {
        System.out.println(name + " підключена через USB");
    }
}