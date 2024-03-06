package lesson_36.hW_36;
/*Task 1
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:
 Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
{2, 4, 6, 8, 1, 3, 5, 7, 7, 9} // Outpur

Task 2
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
{2, 4, 6, 8, 9, 7, 7, 5, 3, 1} // Outpur
 */

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorHW {
    public static void main(String[] args) {
        // Task 1
        Comparator<Integer> myComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 2 == 0) && (o2 % 2 != 0)) {
                    return -1;
                } else if ((o1 % 2 != 0) && (o2 % 2 == 0)) {
                    return 1;
                } else {
                    return o1 - o2;
                }
            }
        };
        Integer[] integers1 = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers1, myComparator);
        System.out.println("Сортировка через анонимный класс: " + Arrays.toString(integers1));
        // Task 2
        Comparator<Integer> myComparator2 = ((o1, o2) -> {
            if ((o1 % 2 == 0) && (o2 % 2 == 0)) {
                return o1 - o2;
            } else if ((o1 % 2 != 0) && (o2 % 2 != 0)) {
                return o2 - o1;
            } else if ((o1 % 2 == 0) && (o2 % 2 != 0)) {
                return -1;
            }else {
                return 1;
            }
        });
        Integer[] integers2 = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Arrays.sort(integers2,myComparator2);
        System.out.println("Сортировка через лямбда- выражение: " + Arrays.toString(integers2));


    }

}

