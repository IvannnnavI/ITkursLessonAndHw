package lesson_10.hw.Hw10;

public class Hw10Task00 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        System.out.println("Исходный массив: ");
        printArray(array);
        System.out.println("Обратный массив: ");
        revers(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void revers(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
