package lesson_37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Методы интерфейса collection
        // все эти методы гарантированно есть в коллекции.

        //boolean add.(E e) добавить элемент.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 100);
        System.out.println(list);

        // int size() -> колличество элементов коллекции

        System.out.println("list size -> " + list.size());

        // boolean remove (Object obj) удаляет элемент из коллекции.
        // T remove (int index) - удаляет по индексу.
        list.remove(Integer.valueOf(100));
        System.out.println("list remove(0)" + list.remove(0));
        System.out.println(list);

        // возвращает true если коллекция пуста.
        System.out.println("list.isempty()-> " + list.isEmpty());

        // boolean contains(object) возвращает true если коллекция содержит элемент.
        System.out.println("list.contains(100)-> " + list.contains(100));

        System.out.println("==========================================");
        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(6);
        listA.add(7);
        listA.add(8);
        System.out.println(list);
        System.out.println(listA);

        // boolean addAll(collection<? extend T>c) - добавляет все элементы из указанной коллекции в коллекцию , у которой вызван метод
        // boolean addAll(int index collection<? extend T>c) - добавляет все элементы из указанной коллекции в коллекцию , у которой вызван метод начиная с указанного индекса


        list.addAll(listA);
        System.out.println(list);
        list.addAll(1, listA);

        System.out.println(list);

        // boolean containsAll(collection c) - возвращает true если коллекция содержит все элементы из указанной коллекции
        List<Integer> listB = new ArrayList<>();
        listB.add(8);
        listB.add(7);
        listB.add(2);
        System.out.println("listb-> " + listB);
        System.out.println("list.containsAll(listB)-> " + list.containsAll(listB));
        System.out.println("\n================================================\n");

        //boolean removeAll(Collection c) - > удаляет все элементы из текущей коллекции , которые содержаться в указанной коллекции.
        System.out.println("list-> " + list);
        System.out.println("listB-> " + listB);
        System.out.println("list.removeAll(listB)-> " + list.removeAll(listB));
        System.out.println("list-> " + list);
        System.out.println("\n================================================\n");
        System.out.println("list-> " + list);
        System.out.println("listA-> " + listA);
        // boolean retainAll(Collection a) оставляет только те элементы , которые содеожатся в указанной коллекции.
        System.out.println("list.retainAll(listA)-> " + list.retainAll(listA));
        System.out.println(list);
        //clear()- Удаляет все элементы из коллекции.
        listA.clear();
        System.out.println(listA);
        System.out.println(listA.size());
        System.out.println(listA.isEmpty());

        // Object[] toArray()
        //[T] toArray (T[] array)
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        //removeIf(Predicate<T> pr) - удаляет все элементы из коллекции удовлетворяющие условию приедиката.
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);


    }
}
