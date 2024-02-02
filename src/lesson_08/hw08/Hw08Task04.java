package lesson_08.hw08;

//Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
//
//Пример:
//
//{ 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}

public class Hw08Task04 {
    public static void main(String[] args) {
        int[] array = {5, 6, -25, 0, 30, -15};
        int min = 0;
        int max = 0;
        int k = 0;


        while (k < array.length) {
            if (array[k] < array[min])
                min = k;
            if (array[k] > array[max])
                max = k;
            k++;
        }
        k = 0;
        System.out.print("{ ");
        while (k < array.length) {
            System.out.print(array[k]);
            if (k < array.length - 1) {
                System.out.print(", ");
            }
            k++;
        }
        System.out.print(" }  ->");

        int pl = array[min];
        array[min] = array[max];
        array[max] = pl;
        k = 0;
        System.out.print("   { ");
        while (k < array.length) {
            System.out.print(array[k]);
            if (k < array.length - 1) {
                System.out.print(", ");
            }
            k++;
        }
        System.out.print(" }");

    }
}
