package hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MyHashMap<K, V> implements InterfaceHashMap<K, V> {

    private Node<K, V>[] buckets;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int size;

    public MyHashMap() {
        this.buckets = (Node<K, V>[]) new Node[capacity];
    }

    /*
    1. Вычислить хэш-код ключа.
    2. На основание кэша определить индекс корзины в массиве.
    3. Если в корзине еще нет элементов - положить новую пару ключ-значение
    4. Если в корзине есть элементы: пройти по цепочке элементов, проверить ключи на совпадение.
    4.1. Если ключи совпадают - обновить значение для соответствующего ключа
    4.2. Если не найдено совпадений ключей - приклеить новую пару в конец списка
     */
    @Override
    public V put(K key, V value) {
        // Шаг 1: Вычисление индекса
        int index = getIndex(key);
        Node<K, V> newNode = new Node<>(key, value);
        Node<K, V> current = buckets[index];

        // Шаг 2: Проверяем, пуста ли корзина
        if (current == null) {
            buckets[index] = newNode;
            size++;
            return null;
        }

        // Шаг 3: Обход элементов в корзине
        Node<K, V> previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                // Шаг 4.1: Ключи совпадают, обновляем значение
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            previous = current;
            current = current.next;
        }

        // Шаг 4.2: Ключ уникален, добавляем новую пару в конец списка
        previous.next = newNode;
        size++;

        // Проверяем необходимость расширения таблицы
        if ((1.0 * size) / capacity >= loadFactor) {
            resize();
        }

        return null;
    }

    /*
    Для получения значения по ключу
    1. Получить хэш ключа. Определить индекс ячейки в массиве
    2. Проводится поиск в этой ячейке. Если элемент/ы присутствуют, сверить ключи для каждого?
    2.1. если ключи совпали - вернуть значение
    2.2. если не совпали - вернуть null
     */
    @Override
    public V get(Object key) {
        // Шаг 1: Получение индекса

        int index = getIndexObject(key);
        Node<K, V> current = buckets[index];

        // Шаг 2: Поиск в ячейке
        while (current != null) {
            if (current.key.equals(key)) {

                // Шаг 2.1: Ключи совпали
                return current.value;
            }
            current = current.next;
        }
        // Шаг 2.2: Ключ не найден
        return null;
    }

    /*
    1. Надо проверить если в карте нода с соответсвующий ключом
    2. Если есть - удалить эту ноду, вернув значение, которое соответствовало ключу
    2.1. Если нет - вернуть null
     */
    @Override
    public V remove(Object key) {
        int index = getIndexObject(key);
        Node<K, V> current = buckets[index];
        Node<K, V> previous = null;

        // Шаг 1: Поиск ноды
        while (current != null) {
            if (current.key.equals(key)) {
                // Шаг 2: Удаление ноды
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return current.value;
            }
            previous = current;
            current = current.next;
        }
        // Шаг 2.1: Ключ не найден
        return null;
    }

    private V removeNode(Node<K, V> previous, Node<K, V> current, int index) {
        /* Для удаления ноды нам нужно знать:
        1. Есть ли нода перед удаляемой
        2. Под каким индексом в массиве она находится
        3. Ссылка на саму удаляемую ноду.
         */

        V value = current.value;

        //TODO

        size--;
        return value;
    }

    @Override
    public Set<K> keySet() {
        Set<K> result = new HashSet<>();
        for (Node<K, V> node : buckets) {
            while (node != null) {
                result.add(node.key);
                node = node.next;
            }
        }

        return result;
    }

    @Override
    public Collection<V> values() {
        Collection<V> result = new ArrayList<>();

        // Todo

        return result;
    }

    @Override
    public boolean containsKey(Object key) {
        /*
        1. Получить хэш ключа и индекс
        2. Пройти по цепочке, проверить ключи на равенство
         */


        return false;
    }

    @Override
    public void clear() {
        capacity = 16;
        buckets = (Node<K, V>[]) new Node[capacity];
        size = 0;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        //Todo
        return null;
    }

    @Override
    public boolean isEmpty() {
        //Todo
        return true;
    }

    private void resize() {
        System.out.println("\nПересчет карты==============\n");
        // TODO увеличить массив, перераспределить элементы
        /*
        1. Увеличить capacity
        2. Создать новый массив
        3. Пересчитать хэши и индексы для всех существующий пар
        4. Перекинуть ссылки массивов
         */

        capacity = capacity * 2;
        Node<K, V>[] newBuckets = (Node<K, V>[]) new Node[capacity];

        //Todo реализовать resize()

        System.out.println("Пересчет завершен");

        buckets = newBuckets;


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (Node<K, V> node : buckets) {
            if (node != null) {
                sb.append(node.getList());
            }
        }

        return sb.append("]").toString();
    }

    private int getIndex(K key) {
        //проверка ключа на null
        if (key == null) return 0;



        // capacity ДОЛЖНО быть степенью двойки
        int index = key.hashCode() & (capacity - 1);

//        System.out.println("index: " + index);
        return index;
    }

    //Получение индекса в массиве корзин по hashCode ключа
    private int getIndexObject(Object key) {
        //"Обрезание" hashCode в рамки от 0 до capacity-1 включительно
        return key != null ? key.hashCode() & (capacity - 1) : 0;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" +
                    key +
                    ": " + value +
                    '}';
        }

        public String getList() {
            Node<K, V> cursor = this;
            StringBuilder sb = new StringBuilder("[");
            while (cursor != null) {
                sb.append(cursor);
                sb.append(", ");
                cursor = cursor.next;
            }

            sb.setLength(sb.length() - 2);
            return sb.append("]").toString();

        }
    }

}
