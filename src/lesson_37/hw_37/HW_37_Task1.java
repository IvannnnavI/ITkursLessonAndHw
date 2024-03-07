package lesson_37.hw_37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HW_37_Task1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        System.out.println("ArrayList -> " + arrayList);
        System.out.println("linkedList -> " + linkedList);
        List<Integer> commonElements = searchCommonElements(arrayList,linkedList);
        System.out.println("Общие элементы: " + commonElements);

//       Можно и так чтобы метод не писать.
//        System.out.println("ArrayList -> " + arrayList);
//        System.out.println("linkedList -> " + linkedList);
//        System.out.println("RetainAll -> " + arrayList.retainAll(linkedList));
//        System.out.println("newArrayList -> " + arrayList);


    }

    public static <E> List<E> searchCommonElements(List<E> list1, List<E> list2) {
        List<E> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        return commonElements;
    }
}
