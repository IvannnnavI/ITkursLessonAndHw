package lesson_09.homework09;

import java.util.Random;

//Заполните массив 20 случайными целыми числами. Программа должна вывести на экран массив,
// количество четных чисел в массиве и сумму всех четных чисел.
public class Hw09Task00 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr = new int[20];
        int evenCount = 0, evenSum = 0;
        System.out.print("Массив: [");
        for (int i = 0; i < arr.length; i++) {
            arr [i] = random.nextInt(100) +1;
            System.out.print(arr[i]);
            if (i< arr.length -1) {
                System.out.print(", ");
            }
            if (arr [i] %2 ==0) {
                evenCount++;
                evenSum += arr[i];
            }
        }
        System.out.println("]");
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Сумма четных чисел: " + evenSum);
    }

}
