package util;

import java.lang.reflect.Array;

public class MyLinkedList<T> implements MyList<T>, MyQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    private int i;


    // метод добавления элемента в конец списка.
    @Override
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value, last, null);
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
        size++;
    }

    // добавить слева элемент
    public void addFirst(T value) {
        if (first == null) {
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = first;

            first = new Node<>(value, null, last);
            last.previous = first;
        } else {
            Node<T> temp = first;
            first = new Node<>(value, null, temp);
            temp.previous = first;

        }
        size++;
    }

    // Удаляем самый левый элемент.
    public T remove() {
        if (size == 0) return null;

        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            first = last;
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;

        }
        size--;
        return value;

    }

    public T removeLast() {
        if (size == 0) return null;

        T value;
        if (size == 1) {
            value = first.value;
            first = null;
            last = null;
        } else if (size == 2) {
            value = last.value;
            last = first;
            last.next = null;
        } else {
            value = last.value;
            last = last.previous;
            last.next = null;
        }
        size--;
        return value;
    }

    @Override
    public void add(T value) {
        if (first == null) {
            // добавляемая нода станет первой и единственной.
            first = new Node<>(value, null, null);
        } else if (last == null) {
            //существует только одини узел First, надо справа приклеить новую Node
            last = new Node<>(value, first, null);
            first.next = last;
        } else {
            Node<T> temp = last;
            last = new Node<>(value, temp, null);
            temp.next = last;
        }
        size++;

    }

    @Override
    public void addAll(T... values) {
        for (T value : values) {
            add(value);
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        int index = 0;
        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            cursor = cursor.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        int index = size - 1;
        Node<T> cursor = last;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return index;
            }
            cursor = cursor.previous;
            index--;
        }
        if (size != 0 && first.value.equals(value)) return 0;

        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        if (first == null) {
            return (T[]) Array.newInstance(Object.class, 0);
        }
        T[] result = (T[]) Array.newInstance(first.value.getClass(), size);
        Node<T> cursor = first;
        for (int i = 0; i < size; i++) {
            result[i] = cursor.value;
            cursor = cursor.next;

        }
        return result;
    }

    @Override
    public boolean contains(T value) {
        Node<T> cursor = first;
        while (cursor != null) {
            if (cursor.value.equals(value)) {
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }


    @Override
    public boolean remove(T value) {
        Node<T> cursor = first;

        while (cursor != null) {
            if (cursor.value.equals(value)) {
                if (cursor == first) {
                    first = cursor.next;
                    if (first != null) {
                        first.previous = null;
                    } else {
                        last = null;
                    }
                } else if (cursor == last) {
                    last = cursor.previous;
                    if (last != null) {
                        last.next = null;
                    }
                } else {
                    cursor.previous.next = cursor.next;
                    cursor.next.previous = cursor.previous;
                }
                size--;
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) return null; // Проверка на корректность индекса

        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }

        T value = cursor.value;
        if (cursor == first) {
            first = cursor.next;
            if (first != null) {
                first.previous = null;
            } else {
                last = null;
            }
        } else if (cursor == last) {
            last = cursor.previous;
            if (last != null) {
                last.next = null;
            }
        } else {
            cursor.previous.next = cursor.next;
            cursor.next.previous = cursor.previous;
        }
        size--;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size)
            return null;
        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        return cursor.value;
    }

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) return; // Проверка на корректность индекса

        Node<T> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        cursor.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> cursor = first;
        while (cursor != null) {
            sb.append(cursor.value);
            cursor = cursor.next;
            if (cursor != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    @Override
    public T getFirst() {
        return (first != null) ? first.value : null;
    }

    @Override
    public T getLast() {
        return (last != null) ? last.value : null;
    }

    @Override
    public T removeFirst() {
        if (size == 0) return null;

        T value = first.value;
        if (size == 1) {
            first = null;
        } else if (size == 2) {
            first = last;
            first.previous = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;

        }
        size--;
        return value;
    }

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}
