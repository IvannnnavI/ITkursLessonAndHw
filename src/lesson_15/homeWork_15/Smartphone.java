package lesson_15.homeWork_15;

public class Smartphone {
    String marka;
    String model;
    int yearOfRelease;

    public Smartphone(String smartMarka, String smartModel, int smartYearOfRelease) {
        marka = smartMarka;
        model = smartModel;
        yearOfRelease = smartYearOfRelease;
    }

    public void makeACall() {
        System.out.println(marka + model + yearOfRelease + " делает звонок.");
    }

    public void sendAMessage() {
        System.out.println(marka + model + yearOfRelease + " отправляет сообщения");
    }
}

