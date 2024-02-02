package lesson_06.hw06;

import java.util.Random;
//Запишите в 4 переменные случайные числа от 0 до 100
//Выведите все 4 на экран
//Программа должна определить максимальное из этих четырех чисел
//Результат вывести на экран


public class hw06t01 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Числа: " + a + ", " + b + ", " + c + ", " + d + ".");
        System.out.println("Максимальное из этих четырёх чисел: " + max);

    }
}
