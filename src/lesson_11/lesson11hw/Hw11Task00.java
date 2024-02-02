package lesson_11.lesson11hw;

//Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
//{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
//Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
//{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
//Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке

public class Hw11Task00 {
    public static void main(String[] args) {
        int [] array = {1, 4, 3, 6, 7};

        printRevers(array);
        printRevers(array, 2);
        printRevers(array,true);
        printRevers(array,false);

    }
    public static void printRevers(int[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printRevers(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = array.length - 1; i >= index ; i--) {
            System.out.print(array[i] + ((i >0) ? " ": ""));
        }
        System.out.println();
    }
    public static void printRevers(int[] array, boolean flag) {
        if (flag) { printRevers(array);
    } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        }

}
