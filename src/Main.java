import computer.*;

public class Main {
    public static void main(String[] args) {
        Monitor lgMonitor = new Monitor("LG");

        Computer myPC = new Computer("Lenovo ThinkCentre", "Intel i7");
        myPC.setMonitor(lgMonitor);
        myPC.start(); // запускаємо комп’ютер

        System.out.println("--------------------------------");

        Periphery usbKeyboard = new Keyboard("Logitech USB Клавіатура");
        Periphery btKeyboard = new Bluetoothmouse("HP Bluetooth Миша");

        usbKeyboard.info();
        usbKeyboard.connect();

        System.out.println();

        btKeyboard.info();
        btKeyboard.connect();
        }
    }

