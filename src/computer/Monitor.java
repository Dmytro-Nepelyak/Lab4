package computer;

public class Monitor {
    private String brand;

    public Monitor(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("Монітор " + brand + " підключено.");
    }
}