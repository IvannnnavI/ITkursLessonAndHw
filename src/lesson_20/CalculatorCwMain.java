package lesson_20;

/*
Класс "Калькулятор" Создайте класс Calculator, который будет предоставлять базовые арифметические операции:
 сложение, вычитание, умножение и деление.
Класс должен содержать: Статические методы для каждой операции,
 принимающие два аргумента и возвращающие результат операции.
 */
public class CalculatorCwMain {
    public static double add (double x, double y) {
        double result = x = y;
        return result;
    }

    public static double sub (double x, double y) {
        return x-y;

    }

    public static double multy (double x, double y) {
        return x*y;

    }

    public static double divide (double x, double y) {
        if (y==0) return Integer.MIN_VALUE;
        return x/y;

    }
}
