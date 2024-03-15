package lesson_42;

import java.util.List;
import java.util.Optional;

public class TerminalsMethods {
    public static void main(String[] args) {
        // терминальные методы.
        // методы которые возращают одно значение
        /*
        boolean allMatch(Predicate(T) predicate) - возвращает тру если все элементы соотвествуют предикату.
                anyMatch(Predicate(T) predicate) - возвращает тру если хотя бы один соот. предикату.
                noneMatch(Predicate(T) predicate) - возвращает тру если ни один элемент не соот. предикату.
        Optional<T> findFirst() - возвращает первый элемент потока
        Optional<T> findAny() - возвращает произвольный элемент потока

        long count() - возвращает кол-во элементов в потоке
        min()
        max()
         */

        task1();
    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 4, 5, -5, 10, 2, 22, 34);
        // отсеять эл-ты >10 и проверить что в потоке остались только четные числа.

        //allmatch
        boolean allMatch = integers.stream().filter(integer -> integer >= 10)
                .allMatch(integer -> integer % 2 == 0);
        System.out.println(allMatch);

        boolean anzMatch = integers.stream().filter(integer -> integer >= 10)
                .anyMatch(integer -> integer % 2 != 0);
        System.out.println(anzMatch);

        boolean noneMatch = integers.stream().filter(integer -> integer >= 10)
                .noneMatch(integer -> integer % 2 != 0);
        System.out.println(noneMatch);

        // findFirst
        Optional<Integer> number = integers.stream()
                .filter(integer -> integer > 20)
                .filter(integer -> integer % 2 == 0)
                .peek(integer -> System.out.println("integer: " + integer))
                .findFirst();
        System.out.println("findFirst : " + number.orElse(null));

        Optional<Integer> number1 = integers.stream()
                .filter(integer -> integer > 20)
                .filter(integer -> integer % 2 == 0)
                .peek(integer -> System.out.println("integer: " + integer))
                .findAny();
        System.out.println("findFirst : " + number1.orElse(null));

        long size = integers.stream().filter(integer -> integer < 0).count();
        System.out.println("size " + size);


    }
}
