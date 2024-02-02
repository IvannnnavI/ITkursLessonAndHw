package lesson_07.hw07;


//Перепишите решение задачи с использованием switch вместо if-else:
//
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
// 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3

import java.util.Scanner;

public class hw07task00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3!");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Вы ввели число 1.");
                break;
            case 2:
                System.out.println("Вы ввели число 2.");
                break;
            case 3:
                System.out.println("Вы ввели число 3.");
                break;
            default:
                System.out.println("Вы ввели неверное число! ");

        }


    }
}
