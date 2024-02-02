package lesson_03;

public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Ivan";
        int age = 37;
        double milkpreise = 0.95;
        System.out.println("Your Name: " + name);
        System.out.println("Your Age: " + age);
        System.out.println("Milk Bio Eko: " + milkpreise);
        System.out.println("=====================>\n");

        // Zadanie 1

        // Объявление переменных
        int var0 = 0, var1 = 1, var2 = 2, var3 = 3, var4 = 4, var5 = 5, var6 = 6, var7 = 7, var8 = 8, var9 = 9;
        // Нахождение среднего значения
        int sum = var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9;
        int average = sum / 10;
        double exAverage = sum / 10.0;
        System.out.println("Исходные цифры: " + var0 + ", " + var1 + ", " + var2 + ", " + var3 + ", " + var4 + ", " + var5 + ", " + var6 + ", " + var7 + ", " + var8 + ", " + var9);
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее значение: " + average);
        System.out.println("Среднее значение (точное): " + exAverage);
        System.out.println("Отброшенная дробная часть: " + (exAverage - average));
        System.out.println("============================>\n");

        // Zadanie 2
        double priceA = 1000;
        double priceB = 500;
        int disk = 10 ;
        double sumprice = priceA + priceB;
        double discount = sumprice * 0.10;

        // double disq = (priceA + priceB) * disk /100

        System.out.println("Стоимость суммы товаров А + В со скидкой: " + disk + " евро");
        System.out.println("Сумма скидки от покупки: " + discount + " евро");
        System.out.println("======================================>\n");

        // Zadanie 3
        int tDay1 = 6;
        int tDay2 = 8;
        int tDay3 = 4;
        int tDay4 = 0;
        int tDay5 = -3;
        int tDay6 = -2;
        int tDay7 = -7;
        double allDaySum = tDay1 + tDay2 + tDay3 + tDay4 + tDay5 + tDay6 + tDay7;
        double aver = allDaySum / 7;

        //System.out.println(" Средняя температура за неделю: " + aver + "°C");
        System.out.printf("Cредняя температура за неделю около: %.2f°C\n", aver);
        System.out.println("=============================>/n");

        // Zadanie 4
        System.out.println("Остатки от деления на 2 и на 3 для чисел от 0 до 9:");
        for (int i = 0; i <= 9; i++) {
            int restvon2 = i % 2;
            int restvon3 = i % 3;
            System.out.println("Число " + i + ": остаток от деления на 2 = " + restvon2 + ", остаток деления на 3 = " + restvon3);
        }
        System.out.println("===============================================>/n");

        // Zadanie 5
        int x = 3;
        x += x++;
        System.out.println("Значение x после выполнения операции х += х++:"  + x);

    }
}

