package lesson_25.hW_25;

import java.lang.reflect.Array;

// Объявление класса массива.
public class RubberArrayHw<T> implements MyList<T> {
    private T[] array;
    private int cursor = 0;
    private static final int MULTIPLAYER = 2;

    @SuppressWarnings("unchecked")
    public RubberArrayHw() {
        array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public RubberArrayHw(T[] values) { // проверить как поломается если не изменить
        array = (T[]) new Object[values.length * MULTIPLAYER];
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }


    @Override
    public void add(T value) {
        if (cursor >= array.length * 0.9) {
            expandArray();
        }
        array[cursor++] = value;


    }

    @SuppressWarnings("unchecked")
    private void expandArray() {
        Object[] newArray = new Object[array.length * MULTIPLAYER];
        System.arraycopy(array, 0, newArray, 0, cursor);
        array = (T[]) newArray;
    }

    @Override
    public String toString() {
        if (cursor == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            sb.append(array[i]).append((i < cursor - 1) ? ", " : "]");
        }
        return sb.toString();

    }


    @Override

    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }

    }

    /*
    Поиск элемента по значению.
    Принять целое число как параметр и возращаем индекс первого элемента, котовый имеет это значение в массиве.
    Если элемент не найден, возврат -1
     */
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

    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }


    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
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
    public Object[] toArray() {
        //Todo что-то пошло не так CCE
        // 1. Создать массив нужной длинны и типа
        // 2. Переписать значения в новый массив
        // 3. Вернуть новый массив из метода

        T[] result = (T[]) new Object[cursor]; // 1. Создаем массив длинной cursor(кол-во элементов во внутреннем массиве)
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        System.out.println("========== instanceof: " + (result[0] instanceof Integer));
//        System.arraycopy(array, 0, result, 0, cursor); // // - альтернативный вариант
        return result; // Integer[]
//         return Arrays.copyOf(array, cursor); // - альтернативный вариант

//        return result;


    }

    public T[] toArray(Class<T> clazz) {


        // Рефлексия
        // 1. Создаем массив длинной cursor(кол-во элементов во внутреннем массиве)
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(clazz, cursor);
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        System.out.println("========== instanceof: " + (result[0] instanceof Integer));
        return result; // Integer[]
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
