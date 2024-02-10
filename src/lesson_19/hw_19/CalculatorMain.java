package lesson_19.hw_19;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Результат сложения: " + Calculator.add(20,19));
        System.out.printf("Результат вычитания: %d%n", Calculator.sub(20, 19));
        System.out.printf("Результат умножения: %d%n", Calculator.multy(20, 19));
        System.out.println("Результат деления: " + Calculator.divide(20,19));

    }
}
