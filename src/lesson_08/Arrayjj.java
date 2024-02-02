package lesson_08;

import java.util.Random;

public class Arrayjj {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int i = 0;
        while (i <array.length) {
            array[i] = random.nextInt(101);
            i++;

        }
        i=0;
        while (i < array.length) {
            System.out.print(" элемент " + i + ": " + array[i]);
            i++;
        }
    }
}
