package lesson_06.hw06;

//программа предлагает пользователю ввести четырехзначное число
//Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
//Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
//Проверить, является ли число "счастливым билетом". Т.е.
// совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры

import java.util.Scanner;

public class hw06t02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое четырёхзначное число:");
        String numbStr = scanner.nextLine();

        // проверка на 4- ёх значность.
        if (numbStr.length() !=4)
        {
            System.out.println("Ошибка!!! Число не является 4-ёх значным. Программа завершена!");
            return;
        }



        int sum1 = Character.getNumericValue(numbStr.charAt(0)) + Character.getNumericValue(numbStr.charAt(1));
        int sum2 =Character.getNumericValue(numbStr.charAt(2)) + Character.getNumericValue(numbStr.charAt(3));
        if (sum1 == sum2) {
            System.out.println(numbStr + " - счастливое число!");
        } else {
            System.out.println(numbStr + " - несчастливое число!");
        }

    }
}
