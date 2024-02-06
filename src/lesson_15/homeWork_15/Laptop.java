package lesson_15.homeWork_15;

public class Laptop {
    String marka;
    String model;
    int yearOfRelease;

    public Laptop(String LaptopMarka, String LaptopModel, int LaptopYearOfRelease) {
        marka = LaptopMarka;
        model = LaptopModel;
        yearOfRelease = LaptopYearOfRelease;
    }

    public void runTheProgram() {
        System.out.println(marka + model + yearOfRelease + " используется для запуска программ.");
    }

    public void writeCode() {
        System.out.println(marka + model + yearOfRelease + " используется для написания кода.");
    }
}
