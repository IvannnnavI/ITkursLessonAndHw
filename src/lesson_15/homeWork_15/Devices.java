package lesson_15.homeWork_15;

public class Devices {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung ", "Galaxy S21 ", 2021);
        Tablet tablet = new Tablet("Apple ", "iPad Air ", 2020);
        Laptop laptop = new Laptop("Lenovo ", "ThinkPad T470s ", 2023);

        System.out.println("Смартфон: ");
        smartphone.makeACall();
        smartphone.sendAMessage();

        System.out.println("Планшет: ");
        tablet.surfTheIntrnet();
        tablet.watchVideos();

        System.out.println("Ноутбук: ");
        laptop.runTheProgram();
        laptop.writeCode();

    }


}
