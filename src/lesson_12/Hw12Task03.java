package lesson_12;

//Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()
//
//на вход принимает массив целых чисел и число - длину нового массива.
// Метод должен создать и распечатать массив заданной в параметрах длинны.
// В начало массива должны быть скопированы элементы из входящего массива:
//
//{0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

public class Hw12Task03 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int[] newArray = copyOfArray(array,3);
        System.out.println("Исходный массив: ");
        printArray(array);
        System.out.println("Новый массив нужной длины: ");
        printArray(newArray);

    }
    public static int[] copyOfArray(int[] original, int newLength) {
        int[] newArray = new int[newLength];
        for (int i = 0; i < newLength && i < original.length ; i++) {
            newArray[i] = original [i];
        }
        return newArray;
    }
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }
}
