package lesson_09;

import java.util.Random;

public class Trenirovka {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 5 + random.nextInt(11);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = -50 + random.nextInt(101);
            System.out.print(array[i] + " ");
        }


    }

}
