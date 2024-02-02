package lesson_06.hw06;

import java.util.Scanner;

public class hw06t02h {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое четырёхзначное число:");
        String numbStr = scanner.nextLine().trim();

        // проверка на 4-ёх значность
        if (numbStr.length() != 4) {
            System.out.println("Ошибка!!! Число не является 4-ёх значным. Программа завершена!");
            return; // Завершаем программу, если условие выполнено
        }

        // проверка, все ли символы в строке числа - цифры
        if (!numbStr.matches("\\d+")) {
            System.out.println("Введенная строка не является числом. Программа завершена!");
            return; // Завершаем программу, если условие выполнено
        }

        int sum1 = (numbStr.charAt(0)  + (numbStr.charAt(1)));
        int sum2 = (numbStr.charAt(2) + (numbStr.charAt(3)));

        if (sum1 == sum2) {
            System.out.println(numbStr + " - счастливое число!");
        } else {
            System.out.println(numbStr + " - несчастливое число!");
        }
    }
    }

