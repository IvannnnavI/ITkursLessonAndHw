package lesson_19.hw_19;
/*
Класс "Счётчик" Разработайте класс Counter, который позволяет создавать объекты-счётчики с возможностью увеличения
 и уменьшения значения счётчика. В классе должны быть:
Поле value для хранения текущего значения счётчика.
Методы increment() и decrement(), увеличивающие и уменьшающие значение счётчика соответственно.
Метод getValue() для получения текущего значения счётчика.
 */
public class Counter {
    private static int value = 0;


    public static void increment(){
        value++;
    }
    public static void decrement(){
        value--;
    }

    public static int getValue() {
        return value;
    }
}
