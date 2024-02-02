package lesson_09;

import java.util.Random;

public class Hw09Task02sqrt {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[100]; // Массив из 100 случайных чисел
        int primeCount = 0;

        System.out.print("Массив: [");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        System.out.print("Простые числа: ");
        for (int num : numbers) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                primeCount++;
            }
        }
        System.out.println("\nКоличество простых чисел: " + primeCount);
    }
}
