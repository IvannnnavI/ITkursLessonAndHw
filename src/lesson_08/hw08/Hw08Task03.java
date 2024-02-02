package lesson_08.hw08;

//Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
//
//Вывести на экран:
//
//минимальное значение, хранящееся в массиве
//максимальное
//среднее арифметическое всех значений в массиве

import java.util.Random;

public class Hw08Task03 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(20) +1;
        int[]array = new int[arrayLength];
        int sum = 0;
        int i = 0;

        while (i < array.length) {
            array[i] = random.nextInt(101);
            sum += array[i];
            i++;
        }

        System.out.print("Массив: ");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        i = 0;

        while (i < array.length) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
            i++;
        }

        double average = (double) sum / array.length;

        System.out.println("Минимальное значение, хранящееся в массиве: " + min);
        System.out.println("Максимальное значение, хранящееся в массиве: " + max);
        System.out.println("Среднее арифметическое всех значений в массиве: " + average);


    }

}
