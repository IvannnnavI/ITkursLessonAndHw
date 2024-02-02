package lesson_12;

public class ArrayUtils {

    public static void main(String[] args) {

        int[] ints = {11, 0, 77, 33, 24, 56, 83, 99, 105, 45, -8, -15};

        int minIndex = minIndexSearch(ints);
        System.out.println(minIndex + " | " + ints[minIndex]);

        printArr(ints);

        sortArray(ints);

        printArr(ints);

        System.out.println(linealSearch(ints, 100));
        System.out.println(binarySearch(ints,100));


    }

    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;//

        while (startIndex <= endIndex) {
            counter ++;

        }

        while (startIndex <= endIndex) {
            //вычислить индекс середины
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            //Сравниваем значение в середине с искомым
            if(array[middleIndex] == searchValue) {
                System.out.println("Элемент найден! Шагов затрачено: " + counter);
                return middleIndex;
            }

            //  надо понять в какой части массива может быть искомое значение
            //  понять какую сторону отбросить.. сместить индексы

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            }else {
                // отбрасываем левую часть
                startIndex = middleIndex + 1;
            }
        }
        System.out.println("элемент отсутствует. шагов затрачено" + counter);
        return -1;


    }

    // найти элемент в массиве по значению
    // линейный поиск
    public static int linealSearch(int[] ints, int value) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) return i;
        }
        return -1;
    }


    // Сортировка
    public static void sortArray(int[] array) {
        // Мы запускаем цикл. Ищем мин элемент. Меняем местами с "самым левым".
        // Уменьшаем "зону поиска" (смещаем вправо левую границу)

        for (int i = 0; i < array.length; i++) {

            // Находим минимум в текущей части массива
            int minIndex = minIndexSearch(array, i);

            // мне нужно поменять местами значения самого левого и минимального элемента
            // есть индексы. Индекс самого левого элемента i

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
    }

    // Ищем минимальное значение в части массива. Начиная с индекса startIndex
    public static int minIndexSearch(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }


    // метод поиска минимального значения в массиве
    // Будем возвращать индекс минимального элемента
    public static int minIndexSearch(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
        }
    }
}




