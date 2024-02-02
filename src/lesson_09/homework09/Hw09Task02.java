package lesson_09.homework09;

//Заполните массив 50 случайными числами от 1 до 100.
// Программа должна найти, и вывести на экран все простые числа.
// Посчитайте сколько получилось таких чисел в массиве.
// Простое число - число, которое делится на цело только на 1 и само себя.
//Пример простых чисел: 3, 5, 7, 11, 13 и т.д.

import java.util.Random;

public class Hw09Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[50];
        int primeCount =0;

        long start = System.currentTimeMillis() ;        // zasekaem vremya
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100)+1;
            boolean isPrime = true;
            if (numbers[i] <= 1) {
                isPrime = false;
            }else {
                for (int j = 2; j < numbers[i]; j++) {
                    if (numbers[i] % j ==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.print(numbers[i] + " ");
                primeCount++;
            }
        }
        System.out.println("\nКоличество простых чисел: " + primeCount);

        long end = System.currentTimeMillis();   // vremya v sekundax
        System.out.println("vremya cikla: " + end);
    }
}
