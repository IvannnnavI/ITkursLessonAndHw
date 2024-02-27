package lesson_29;

import util.MyLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        System.out.println("Новый связанный список: " + linkedList);

        linkedList.addLast(100);
        System.out.println("После добавления 100: " + linkedList);

        linkedList.addFirst(50);
        System.out.println("После добавления 50 в начале: " + linkedList);

        linkedList.addLast(200);
        linkedList.addLast(300);
        linkedList.addFirst(10);
        System.out.println("После нескольких дополнений: " + linkedList);

        System.out.println("Список пуст" + linkedList.isEmpty());

        linkedList.remove();
        System.out.println("После удаления первого элемента: " + linkedList);

        linkedList.removeLast();
        System.out.println("После удаления последнего элемента: " + linkedList);

        System.out.println("Значение, удаленное командой RemoveLast: " + linkedList.removeLast());

        linkedList.addAll(0, 1, 2, 3, 4, 5, 6, 7);
        System.out.println("После добавления коллекции: " + linkedList);

        int index = linkedList.indexOf(3);
        System.out.println("Индекс значения 3: " + index);

        int lastIndex = linkedList.lastIndexOf(3);
        System.out.println("Последний индекс значения 3: " + lastIndex);

        System.out.println("Элемент с индексом 2:" + linkedList.get(2));

        linkedList.set(2, 22);
        System.out.println("После установки значения 22 в индексе 2: " + linkedList);

        boolean contains = linkedList.contains(22);
        System.out.println("Список содержит 22: " + contains);

        linkedList.remove(Integer.valueOf(22));
        System.out.println("После удаления значения 22: " + linkedList);

        linkedList.remove(3); // Assuming this removes the element at index 3
        System.out.println("После удаления элемента с индексом 3: " + linkedList);

        // Test toArray
        Integer[] array = linkedList.toArray();
        System.out.print("Список в массив: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Очистка списка.
        while (!linkedList.isEmpty()) {
            linkedList.remove();
        }
        System.out.println("После очистки списка:" + linkedList);
    }
}
