package lesson_19.hw_19;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multy(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка! Делить на нуль нельзя!");
            return Double.parseDouble(" ") ;


        }
        return a / b;

    }
}
