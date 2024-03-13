package lesson_40.hw_40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Hw_40_Task123 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 6, 15, 234, 34, 15, 64, 333, 44, 5));
        String string = "Создайте цепочку функций, которая сначала удаляет пробелы из строки, затем преобразует её в верхний регистр,\n" +
                " и в конце считает количество символов в измененной строке";
        System.out.println("Task 1 исходный список чисел-> " + integers);
        System.out.println("Task 1 вывод после работы метода -> " + filterNumber(integers));
        System.out.println("==================================================================");
        System.out.println("Task 2 исходная строка -> " + string);
        System.out.println("Task 2 количество символов(без пробелов) в исходной строке = " + numberOfCharactersInLine(string));
        System.out.println("==================================================================");
        System.out.println("Task 3 Примеры BiConsumer:");
        keyAndValuePrint("Бульдог", "Порода собаки");
        keyAndValuePrint("BMW", "Марка автомобиля");


    }

    // Task 1.
    // Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
    // Используйте несколько предикатов для фильтрации списка чисел,
    // где числа должны быть четными, больше 10 и меньше 100
    public static List<Integer> filterNumber(List<Integer> numbers) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreatThanTen = n -> n > 10;
        Predicate<Integer> isLessThan100 = n -> n < 100;
        return numbers.stream()
                .filter(isEven.and(isGreatThanTen).and(isLessThan100)).collect(Collectors.toList());
    }
//    Task 2
//    Создайте цепочку функций, которая сначала удаляет пробелы из строки, затем преобразует её в верхний регистр,
//    и в конце считает количество символов в измененной строке

    public static int numberOfCharactersInLine(String string) {
        Function<String, String> removesSpacesInALine = s -> s.replace(" ", "");
        Function<String, String> toUpperCase = String::toUpperCase;  // toUpperCase = s-> s.toUpperCase(); при такой записи подчеркивает желтым. При использовании лямбды - всё ОК.
        Function<String, Integer> getStringLength = String::length;
        return removesSpacesInALine.andThen(toUpperCase).andThen(getStringLength).apply(string);
    }

    //Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
    //BiConsumer (байконсьюмер) — это функциональный интерфейс, введенный в Java 8,
    // который позволяет обрабатывать два входных аргумента одновременно. Он предоставляет средство для манипулирования
    // и координации данных без необходимости выполнять две отдельные задачи обработки.
    //void accept(T t, U u)
    public static void keyAndValuePrint(String key, String value) {
        BiConsumer<String, String> print = (k, v) -> System.out.println(k + " = " + v);
        print.accept(key, value);

    }
}
