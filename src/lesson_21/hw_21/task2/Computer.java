package lesson_21.hw_21.task2;

public class Computer {private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer() {
        this.processor = new Processor("Intel", "Core i7-10700K");
        this.memory = new Memory("Corsair", "Vengeance LPX 16GB");
        this.storage = new Storage("Samsung", "970 EVO Plus 1TB");
    }

    public void printComputerDetails() {
        System.out.println("Компьютер состоит из следующих компонентов:");
        System.out.println("Процессор: " + processor.getBrand() + " " + processor.getModel());
        System.out.println("Память: " + memory.getBrand() + " " + memory.getModel());
        System.out.println("Накопитель: " + storage.getBrand() + " " + storage.getModel());
    }
}
