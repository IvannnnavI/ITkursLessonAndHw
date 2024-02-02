package lesson_10.hw.Hw10;
//Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
//
//класс Math для нахождения степени числа использовать нельзя ;)

import java.util.Scanner;

public class Hw10Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число степени для 2: ");
        int number = scanner.nextInt();
        twoAnyPower(number);
    }

    public static void twoAnyPower(int number) {
        int twoAnyPower = (number > 0) ? number: number -1;

        long result = 1;

        for (int i = 0; i < twoAnyPower; i++) {
            result *= 2;
        }
        if (number > 0 ) {
            System.out.println("2 в степени " + number + " = " + result);
        } else {
            System.out.printf("1/%d/n", result);
            System.out.printf("%.2f\n", (double) 1 /result);
        }

    }
}
