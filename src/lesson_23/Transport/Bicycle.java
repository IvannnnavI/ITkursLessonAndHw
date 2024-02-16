package lesson_23.Transport;

public class Bicycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("У велосипеда нет двигателя");
    }

    @Override
    public String toString() {
        return "Bicycle {id: " + getId() + " ; engine: Двигателя нет.";

    }
}
