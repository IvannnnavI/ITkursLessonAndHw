package lesson_04;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String name = "Сигизмунд";

        String name2 = new String("Hello");

        System.out.println(name.length());//получить длину строки

        int lenght = name.length();

        System.out.println(name.toUpperCase(Locale.ROOT)); // привести к верхнему регистру.
        System.out.println(name.toLowerCase());
    }
}
