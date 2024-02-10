package lesson_19.hw_19;

public class MainCounter {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        Counter.increment();
        Counter.increment();
        System.out.println("Значение счётчика: " + Counter.getValue());
        Counter.decrement();
        System.out.println("Значение счётчика: " + Counter.getValue());


    }
}
