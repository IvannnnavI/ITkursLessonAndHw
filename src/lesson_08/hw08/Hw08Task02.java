package lesson_08.hw08;
//Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
//
//567432 -> 5+6+7+4+3+2 -> 27

import java.util.Scanner;

public class Hw08Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = scanner.nextInt();
        if (numb < 0){
            numb *= -1;
        }
        int originalnumb = numb;
        int sum = 0;

        StringBuilder calculation = new StringBuilder();

        while (numb != 0) {
            int digit = numb % 10;
            sum += digit;
            numb /= 10;
            calculation.insert(0, (numb != 0 ? "+" : "") + digit);
        }

        System.out.println(originalnumb + " -> " + calculation.toString() + " -> " + sum);
    }
}
