package lesson_03;

public class MathOperation {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;

        result = var1 + var2;
        System.out.println("result " + result);
        result = 15 + 6;
        System.out.println("result " + result);
        int result2 = var1 + var2;
        result = var1 - var2;
        System.out.println("result -:" + result);
        result = var1 * var2;
        System.out.println("multresult:" + result);

        result = var1 / var2;
        System.out.println("devResult -:" + result);
        result = var1 % var2;
        System.out.println("restResult: " + result);

        System.out.println("Целочисленное деление: " + (4 / 2));
        System.out.println("Остаток от Деления 4 % 2 = " + (4 % 2));

        System.out.println((5/10));
        System.out.println((5%10));

        System.out.println("=====================================\n");

        double doubleVar = 20.0d;
        double doubleSeven = 7.0;

        double doubleResult = doubleVar / doubleSeven;
        System.out.println("doubleResult dev = " + doubleResult);
        // форматированный вывод
        int a = 20;
        int b = 7;
        int intResult = a / b;
        System.out.printf("Результат деления %d на %d \nравен = %d\n" , a, b, intResult);
        // \n знак перевода каретки
        System.out.println("Что-нибудь!");

        System.out.printf("округленный результат деления %.2f\n" , doubleResult);
        // %d - шаблон для цифры (целочисленное)
        // %f - шаблон для числа с плавающей точкой
        // %.2f - вывести число с плавающей точкой . Отобразить 2 знака после запятой

        // trouble double
        double x = 0.1;
        double y = 0.2;
        double z = x + y;
        System.out.println("z= " + z);
        x = 1.0;
        y = 3.0;
        z = x / y;
        System.out.println(z);

    }
}
