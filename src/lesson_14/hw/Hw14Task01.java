package lesson_14.hw;
//Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
// Метод должен поменять местами значения, хранящихся в этих индексах
//{0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
//Если индексы за пределами массива?
//Перегрузка метода для работы с массивами строк.

public class Hw14Task01 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        System.out.print("Исходный массив чисел: ");
        printArray(array);
        swap(array, 1, 5);
        System.out.print("Массив чисел с заменой: ");
        printArray(array);
        System.out.println("=========================================>");

        String[] stringsarray  = {"zero", "one", "two", "three", "four", "five", "six" };
        System.out.print("Массив строк исходный: ");
        printArray(stringsarray);
        swap(stringsarray, 1, 5);
        System.out.print("Массив строк с перемещением");
        printArray(stringsarray);



    }

    public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) return;
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }
    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }
    public static void swap(String[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) return;
        String temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
