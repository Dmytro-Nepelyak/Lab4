package computer;

public class Computer {
    private String model;
    private Processor processor; // Композиція
    private Monitor monitor;     // Агрегація

    public Computer(String model, String processorModel) {
        this.model = model;
        this.processor = new Processor(processorModel); // створюємо внутрішній об'єкт
    }

    // агрегація
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    // inner - композиція
    public class Processor {
        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public void run() {
            System.out.println("Процесор " + model + " працює");
        }
    }

    // static nested - асоціація
    public static class BIOS {
        public static void load() {
            System.out.println("BIOS завантажено");
        }
    }

    public void start() {
        // локальний клас
        class StartupLogger {
            public void log(String message) {
                System.out.println("[ЛОГ]: " + message);
            }
        }

        StartupLogger logger = new StartupLogger();
        logger.log("Запуск комп’ютера " + model);
        BIOS.load();
        processor.run();
        monitor.display();
        }
    }
