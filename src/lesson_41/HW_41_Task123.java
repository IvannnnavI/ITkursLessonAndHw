package lesson_41;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HW_41_Task123 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,56,-12,34,56,73,23,11,0);
        List<String> strings = List.of("Metallika","AC-DC","Skorpions","NightWish","Aerosmith","The Beatles","Led Zeppelin");
        task1(integers);
        task2(strings);
        task3(integers);



    }

    //Task 1
    //Из списка целых чисел выделите те значения, которые больше 10;
    //отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране.
    private static void task1(List<Integer> integers) {
        List<Integer> result = integers.stream()
                .filter(num -> num > 10)
                .sorted(Comparator.comparingInt(num -> num % 10))
                .collect(Collectors.toList());
        System.out.println("Числа, отфильтрованные и отсортированные: " + result);
    }

    //Task 2
    //Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.
    private static void task2(List<String> strings) {
        int maxLength = strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(-1);  // Находим максимальную длину строки в списке

        List<String> longestStrings = strings.stream()
                .filter(s -> s.length() == maxLength)
                .collect(Collectors.toList());  // Собираем все строки этой длины

        if (longestStrings.size() > 1) {
            System.out.println("Строки с максимальной длиной (" + maxLength + " символов): " + longestStrings);
        } else if (longestStrings.size() == 1) {
            System.out.println("Строка с максимальной длиной (" + maxLength + " символов): " + longestStrings.get(0));
        } else {
            System.out.println("В списке нет строк.");
        }
    }
    //Task 3
    //Имеется список целых чисел.
    //Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число умножить на 2,
    // и собрать результат в новый список

    private static void task3(List<Integer> integers) {
        List<Integer> integerList = integers.stream()
                .filter(num -> num % 2 == 0)
                .map(num-> num * 2)
                .collect(Collectors.toList());
        System.out.println("Список четных чисел из списка умноженных на 2: " + integerList);
    }


}
