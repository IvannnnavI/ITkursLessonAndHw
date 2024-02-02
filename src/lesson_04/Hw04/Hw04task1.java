package lesson_04.Hw04;

public class Hw04task1 {
    public static void main(String[] args) {
        String name = "Иван";
        System.out.println("Количество букв в имени: " + name.length());

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        System.out.println("Десятичный код первой буквы: " + (int)firstChar);
        System.out.println("Десятичный код последней буквы: " + (int)lastChar);
    }
}
