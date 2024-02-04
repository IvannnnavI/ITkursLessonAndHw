package lesson_14.hw;
// Написать метод, принимающий строку и один или два индекса (перегрузка).
// Метод должен возвращать подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно)
// Если индекс 1 - начиная с индекса и до конца строки.
//Функционал повторяет метод String.substring(), так что этот метод использовать не нужно.
// Оригинальный метод ломает программу, если введены не корректные индексы.
// Наш метод аварийно завершать программу не должен.
public class Hw14Task02 {
    public static void main(String[] args) {
        String testString = "Better to overtest than to undertest!";
        System.out.println(testString);
        String substring1 = substringCustom(testString, 14, 18);
        System.out.println("Тест вывода строки с двумя индексами: " + substring1);
        String substring2 = substringCustom(testString, 14);
        System.out.println("Тест вывода строки с одним индексом : " + substring2);


    }

    public static String substringCustom(String input, int start, int end) {
        if (input == null || start < 0 || end > input.length() || start > end) {
            return null;
        }
        char[] resultArray = new char[end - start];
        for (int i = start; i < end; i++) {
            resultArray[i - start] = input.charAt(i);
        }
        return new String(resultArray);
    }

    public static String substringCustom(String input, int start) {
        return substringCustom(input, start, input.length());
    }
}
