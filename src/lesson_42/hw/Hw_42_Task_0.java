package lesson_42.hw;
/*
Task 0
Разбейте строку на слова, используя в качестве разделителя пробел.
Используя функцию reduce верните суммарное количество букв в словах, которые длиннее 4 символов
 */

import java.util.Arrays;

public class Hw_42_Task_0 {
    public static void main(String[] args) {
        String text = "Hello, world and good afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);

    }

    private static int countLetters(String text) {
        return Arrays.stream(text.split("\\s+"))
                .map(word->word.replaceAll("[^a-zA-Z]",""))
                .filter(word->word.length() > 4)
                .mapToInt(String::length)
                .reduce(0,Integer::sum);
    }
}
