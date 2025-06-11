package computer;

public class Periphery {
    protected String name;

    public Periphery(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Пристрій: " + name);
    }

    public void connect() {
        System.out.println(name + " " + "підключено через стандартний порт.");
    }
}