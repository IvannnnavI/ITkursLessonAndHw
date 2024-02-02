package lesson_06;

import java.util.Locale;
import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        scanner.useLocale(Locale.GERMANY);

        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();


        System.out.println("ВВедите Ваш возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Введите число с запятой");
        double dbl = scanner.nextDouble();

        System.out.println("Получили имя:" + name);
        System.out.println("Возраст:" + age);
        System.out.println("Получили число:" + dbl);

    }
}
