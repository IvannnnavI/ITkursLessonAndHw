package lesson_19;

import java.util.Arrays;
import java.util.Random;

public class ArraysUse {
    public static void main(String[] args) {
        // класс Arrays набор статических методов для операций над массивами
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 13, 14, 15};

        // toString - возвращает представление массива в виде строки
        String stringArray = Arrays.toString(ints);
        System.out.println(stringArray);
        System.out.println(Arrays.toString(ints));

        // copyOf
        // новый массив указанной длины указанной длины . Копируя элементы массива.

        int[]newints = Arrays.copyOf(ints,9);
        System.out.println(Arrays.toString(newints));

        // скопировать диапазон значений из старого массива.
        int[]intsRange = Arrays.copyOfRange(ints,2,7);
        System.out.println(Arrays.toString(intsRange));

        // метод заполняющий массив значениями. FILL
        int[] fillArray = new int[10];
        Random random = new Random();
        Arrays.fill(fillArray, random.nextInt(101));
        System.out.println(Arrays.toString(fillArray));

        int[] number = {1,2,3,4};
        int[] digits = {1,2,3,4};

        System.out.println(Arrays.equals(number,digits));

        // deepToString -позволяет получать строковое представление многомерных массивов.
        int[][] matrix = new int[3][4];
        System.out.println(Arrays.deepToString(matrix));

        // Сортировка , поиск, System.arraycopy|



    }
}
