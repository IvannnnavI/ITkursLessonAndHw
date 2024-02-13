package lesson_16.hW_16;

// Объявление класса массива.
public class RubberArrayHw {
    private int[] array; // массив целых чисел, для хранения елементов
    private int cursor; // целочисленное поле, указывает на следующую свободную позицию в массиве(также отображает кол-во элементов в массиве)

    // Конструктор класса.
    // Конструктов класса, без параметров, который инициализирует массив array
    // c начальным розмером 10 элементов
    public RubberArrayHw() {
        array = new int[10];

    }

    /*
    Метод add, добавляет 1 элемент массива. Если массив почти заполнен
    (используется 90% или больше), сначала вызывается метод expandArray()
    для увеличения размера массива.
     */
    public RubberArrayHw(int[] initialValues) {
        cursor = initialValues.length;
        array = new int[cursor];   // точная копия
        //array = new int[cursor*2]; // размер в 2 раза больше
        for (int i = 0; i < cursor; i++) {
            array[i] = initialValues[i];
        }
    }

    void add(int number) {
        if (cursor >= array.length * 0.9) {
            expandArray();
        }
        array[cursor] = number;
        cursor++;

    }
    /*
    Метод удваювающий размер существующего массива, когда нужно добавить больше
    элементов, чем массив может вместить.
    Копирует существующие элементы в новый массив
     */

    void expandArray() {
        int[] newArray = new int[array.length * 2];// новый массив в два раза больше
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];   // копирование элементов в новый массив
        }
        array = newArray;// обновление ссылки на новый массив.

    }

    /*
    Метод add (int...ints) Позволяет добавить несколько элементов одновременно.
    Использует уже существующий метод(int number) для добавления каждого элемента.
     */
    void add(int... ints) {
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);

        }
    }

    /*
    Переназначенный метод toString(), который возвращает порядовое представление
    элементов массива.
    Если массив пустой возвращает[].
     */
    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    /*
    Поиск элемента по значению.
    Принять целое число как параметр и возращаем индекс первого элемента, котовый имеет это значение в массиве.
    Если элемент не найден, возврат -1
     */
    public int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;      // элемент найден вернуть его индекс.
            }
        }
        return -1;            // элемент не найден.
    }

    /*
    Возращение значения по индексу:
    1.Принять индекс как параметр
    2.Вернуть значение элемента по этому индексу.
    3.Если индекс выходит за пределы диапозона, вернуть сообщение об ошибке.
     */
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            System.out.println("Ошибка: указанный индекс " + index + " выходит за пределы массива!");
            return -1;
        }
    }

    /*
    Размер массива.
    Метод возращает количество элементов массива, оно равно значению курсора.
     */
    public int size() {
        return cursor;
    }

    /*Удаление элемента по индексу

     */
    public void minusAt(int index) {
        if (index >= 0 && index < cursor) {
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--; // уменьшаем количество элементов после удаления.
        } else {
            System.out.println("Ошибка: указанный индекс -  " + index + " выходит за пределы массива!");
        }
    }
// CTRL + ALT + стрелка налево. вернуть назад.
    // Удаление элемента по значению
    public void minusValue(int value) {
        int index = indexOf(value); // нашел элемент индекса с заданным значением
        if (index != -1) {
            minusAt(index); // использую ранее созданный метод
        }
    }

    /*
    Замена значения по индексу:

     */
    public void replaceAt(int index, int newValue) {
        if (index >= 0 && index < cursor) {
            array[index] = newValue;
        } else {
            System.out.println("Ошибка: указанный индекс " + index + "выходит за пределы массива!");
        }
    }

    // Замена значения по значению.
    public void replace(int oldValue, int newValue) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
    }

}
