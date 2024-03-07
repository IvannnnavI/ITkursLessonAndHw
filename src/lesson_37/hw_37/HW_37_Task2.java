package lesson_37.hw_37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HW_37_Task2 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5000; i++) {
            int value = random.nextInt(1001);
            arrayList.add(value);
            linkedList.add(value);
        }
        System.out.println("\u001B[32mArrayList:");
        System.out.println("Время получения всех значений элементов списка по его индексу: " + accessElements(arrayList) + " ms");
        System.out.println("Время вставки 2000 новых значений по случайному индексу: " + insertRandomValues(arrayList) + " ms");
        System.out.println("Время удаления 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции): " + removeElementsByIndex(arrayList) + " ms");
        System.out.println("Время удаления 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000): " + removeElementsByValues(arrayList) + " ms\u001B[0m");
        System.out.println("===============================================================================");
        System.out.println("\u001B[34mLinkedList:");
        System.out.println("Время получения всех значений элементов списка по его индексу: " + accessElements(linkedList) + " ms");
        System.out.println("Время вставки 2000 новых значений по случайному индексу: " + insertRandomValues(linkedList) + " ms");
        System.out.println("Время удаления 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции): " + removeElementsByIndex(linkedList) + " ms");
        System.out.println("Время удаления 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000): " + removeElementsByValues(linkedList) + " ms\u001B[0m");



    }


    private static long accessElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long insertRandomValues(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            int index = random.nextInt(list.size());
            int value = random.nextInt(1001);
            list.add(index, value);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long removeElementsByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long removeElementsByValues(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Integer value = random.nextInt(10000);
            list.remove(value);
        }
        return System.currentTimeMillis() - startTime;
    }
}
