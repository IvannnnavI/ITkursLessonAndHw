package lesson_12;

public class Hw12task01Null {
    public static void main(String[] args) {

        String[] strings = {null, "Hello", "World", "Java", "Code", null, "Task"};

        // Вывод исходного массива
        System.out.print("Исходный массив: ");
        printArray(strings);

        String[] result = findShortestAndLongest(strings);

        // Вывод результатов
        System.out.println("Самая короткая строка: " + result[0]);
        System.out.println("Самая длинная строка: " + result[1]);
    }

    public static String[] findShortestAndLongest(String[] strings) {
        String shortest = null, longest = null;

        for (String str : strings) {
            if (str == null) continue; // Пропускаем null значения
            if (shortest == null || str.length() < shortest.length()) {
                shortest = str;
            }
            if (longest == null || str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
