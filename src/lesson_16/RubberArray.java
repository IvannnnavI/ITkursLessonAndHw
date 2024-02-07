package lesson_16;

public class RubberArray {

    int[] array;
    int cursor; // значение по умолчанию = 0

    public RubberArray() {
        array = new int[10];

    }

    void add(int number) {
        // Добавлять значение массива.
        //  Проверка есть ли место в нашем внутреннем массиве.
        if (cursor > array.length * 0.9) {
            expanndArray(); //  метод расширяющий массив
        }
        array[cursor] = number;
        cursor++;

    }

    void add(int... ints) {
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);

        }
    }


    void expanndArray() {
        System.out.println("Расширяем новый массив! ==================== ");
        //1. создать новый массив большего размера
        //2. Переписать значения из старого массива в новый
        //3. Перебросить ссылку
        int[] newArray = new int[array.length * 2]; // создаю новый массив, в 2 раза больше предыдущего
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;// 3. Перебросить ссылку. Переменная array теперь хранит ссылку на "новый" массив
        System.out.println("Расширение массива завершено +++++++++++++++++++ \n");
    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }
}

/*
+1. Динамическое изменение размера массива
+2. Добавлять в массив элементы
+3. Добавлять в массив несколько элементов
+4. Вывод в консоль значений массива.

 */
