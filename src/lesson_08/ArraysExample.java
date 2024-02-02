package lesson_08;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array;
        int numbers[]; // не рекомендуеться!!!


        // инициализация массива
        array = new int[5];  // создается как объект с нью!!. При инициализации, обязаны указать размер массива.
        // 5 - размер массива, количество ячеек.

        String[] strings = new String[7]; // объявление и инициализация массива.
        // создана переменная  ,которая хранит ссылку на массив Строк (в Stack)
        // мы создали объект в памяти в heap
        // каждую ячейку мы заполнили значениями по умолчанию

        // значения по умолчанию
       // для всех числовых и чар это будет 0. 00
        //   для boolean - false
        // дляя всех ссылочных значение null ничего.

        // Явная инициализация массива:
        int[] digits = new int[] {56, -98, 14, 1004 , 1443};

        String[] strings1 = {"str", "hello", " java", "js", "orange"};

        int value = digits[0]; //  в переменную value было записано значение ячейкм с номером 0
        System.out.println("value: " + value);

        System.out.println("В ячейке под номером 2 в массиве strings1 хранится: " + strings1[2].toUpperCase());
        System.out.println("В ячейке под номером 3 в массиве digits хранится: " + digits[3]);
        System.out.println("Мы можем производить производить операции допустимые типом данных: " + (digits[3] / 2 -15));

        System.out.println(digits);
        // размер массива
        int arraylenght = digits.length;
        int i = 0;
        while (i < arraylenght){
            System.out.print(digits[i++] + ", ");
        }
        System.out.println();

        // Изменение значение в ячейке массива.
        digits[2] = 5000;
        i = 0;
        while (i< digits.length) {
            System.out.print(digits[i++] + ", ");

        }

        System.out.println("array[2] " + array[2]);// проверяем значения в массиве по умолчанию.
        System.out.println("strings[5] " + strings[5]);// попытка вызова у null каких либо методов вызовет, аварийное завершение программы
        strings[5] = "pascal";
        System.out.println("strings[5] " + strings[5]);// попытка вызова у null каких либо методов вызовет, аварийное завершение программы



    }
}
