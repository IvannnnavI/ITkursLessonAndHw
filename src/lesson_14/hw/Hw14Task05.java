package lesson_14.hw;

public class Hw14Task05 {
    public static void main(String[] args) {
        int[] numArray = {0, 1, 2, 3, 4, 5, 6, -5, -3, 8};
        System.out.println("Элементы массива: ");
        printArray(numArray);
        int sumArray = sumOfArray(numArray);
        System.out.print("Сумма всех элементов массива равна: " + sumArray);
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }
}
