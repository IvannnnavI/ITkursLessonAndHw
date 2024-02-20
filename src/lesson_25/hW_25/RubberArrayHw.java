package lesson_25.hW_25;

import java.util.Arrays;

// Объявление класса массива.
public class RubberArrayHw<T> implements MyList<T> {
    private Object[] array; // массив целых чисел, для хранения елементов
    private int cursor; // целочисленное поле, указывает на следующую свободную позицию в массиве(также отображает кол-во элементов в массиве)

    // Конструктор класса.
    // Конструктов класса, без параметров, который инициализирует массив array
    // c начальным розмером 10 элементов
    public RubberArrayHw() {
        array = new Object[10];
    }


    /*
    Метод add, добавляет 1 элемент массива. Если массив почти заполнен
    (используется 90% или больше), сначала вызывается метод expandArray()
    для увеличения размера массива.
     */
//    public RubberArrayHw(int[] initialValues) {
//        cursor = initialValues.length;
//        array = new int[cursor];   // точная копия
//        //array = new int[cursor*2]; // размер в 2 раза больше
//        for (int i = 0; i < cursor; i++) {
//            array[i] = initialValues[i];
//        }
//    }


    @Override
    public void add(T value) {
        if (cursor >= array.length * 0.9) {
            expandArray();
        }
        array[cursor++] = value;


    }
    //    void add(int number) {
//        if (cursor >= array.length * 0.9) {
//            expandArray();
//        }
//        array[cursor] = number;
//        cursor++;

    //  }
    /*
    Метод удваювающий размер существующего массива, когда нужно добавить больше
    элементов, чем массив может вместить.
    Копирует существующие элементы в новый массив
     */
    private void expandArray() {
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, cursor);
        array = newArray;
    }

    @Override
    public String toString() {
        return "RubberArrayHw{" +
                "array=" + Arrays.toString(array) +
                ", cursor=" + cursor +
                '}';
    }
    //    void expandArray() {
//        int[] newArray = new int[array.length * 2];// новый массив в два раза больше
//        for (int i = 0; i < cursor; i++) {
//            newArray[i] = array[i];   // копирование элементов в новый массив
//        }
//        array = newArray;// обновление ссылки на новый массив.
//
//    }

    /*
    Метод add (int...ints) Позволяет добавить несколько элементов одновременно.
    Использует уже существующий метод(int number) для добавления каждого элемента.
     */
    @Override

    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }

    }
//    void add(int... ints) {
//        for (int i = 0; i < ints.length; i++) {
//            add(ints[i]);
//
//        }
//    }

    /*
    Поиск элемента по значению.
    Принять целое число как параметр и возращаем индекс первого элемента, котовый имеет это значение в массиве.
    Если элемент не найден, возврат -1
     */
//    public int indexOf(int value) {
//        for (int i = 0; i < cursor; i++) {
//            if (array[i] == value) {
//                return i;      // элемент найден вернуть его индекс.
//            }
//        }
//        return -1;            // элемент не найден.
//    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /*
        Возращение значения по индексу:
        1.Принять индекс как параметр
        2.Вернуть значение элемента по этому индексу.
        3.Если индекс выходит за пределы диапозона, вернуть сообщение об ошибке.
         */
    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }
        return (T) array[index];
    }

//    public int get(int index) {
//        if (index >= 0 && index < cursor) {
//            return array[index];
//        } else {
//            System.out.println("Ошибка: указанный индекс " + index + " выходит за пределы массива!");
//            return -1;
//        }
//    }

    /*
    Размер массива.
    Метод возращает количество элементов массива, оно равно значению курсора.
     */
//    public int size() {
//        return cursor;
//    }
    @Override
    public int size() {
        return cursor;
    }

    /*Удаление элемента по индексу

     */
    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }

        T element = (T) array[index];
        int numMoved = cursor - index - 1;
        if (numMoved > 0) {
            System.arraycopy(array, index + 1, array, index, numMoved);
        }
        array[--cursor] = null;
        return element;
    }
//    public void minusAt(int index) {
//        if (index >= 0 && index < cursor) {
//            for (int i = index; i < cursor - 1; i++) {
//                array[i] = array[i + 1];
//            }
//            cursor--; // уменьшаем количество элементов после удаления.
//        } else {
//            System.out.println("Ошибка: указанный индекс -  " + index + " выходит за пределы массива!");
//        }
//    }
// CTRL + ALT + стрелка налево. вернуть назад.
    // Удаление элемента по значению


    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

//    public void minusValue(int value) {
//        int index = indexOf(value); // нашел элемент индекса с заданным значением
//        if (index != -1) {
//            minusAt(index); // использую ранее созданный метод
//        }
//    }

    /*
    Замена значения по индексу:

     */
//    public void replaceAt(int index, int newValue) {
//        if (index >= 0 && index < cursor) {
//            array[index] = newValue;
//        } else {
//            System.out.println("Ошибка: указанный индекс " + index + "выходит за пределы массива!");
//        }
//    }

    // Замена значения по значению.
//    public void replace(int oldValue, int newValue) {
//        for (int i = 0; i < cursor; i++) {
//            if (array[i] == oldValue) {
//                array[i] = newValue;
//            }
//        }
//    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == null && value == null) {
                return i;
            }
            if (array[i] != null && array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        return (T[])
                java.util.Arrays.copyOf(array, cursor);
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= cursor) {
            return;
        }
        array[index] = value;

    }
}
