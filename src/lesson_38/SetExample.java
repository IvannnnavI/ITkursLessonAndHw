package lesson_38;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        /*
        Контракт между hashcode() и equals()
        1. Если два объекта равны между собой по equals(), то их хеш коды тоже должны быть равны.
        2. Если Хэш коды двух объектов различны ,то эти объекты абсолоютно точны не равны по equals()
        3. Вызов метода hashCode() должен возвращать одинаковое значение при многократных вызовах на неизменённом объекте.
         */

        Set<Integer> integersConstr = new HashSet<>();// 16 корзин. load factor = 0.75
        Set<Integer> integersConstr1 = new HashSet<>(28);//32 корзины(ближайшая степень двойки) задаём значение корзин
        Set<Integer> integersConstr2 = new HashSet<>(28,0.80f);//32 корзины(ближайшая степень двойки) задаём loadFactor
        Set<Integer> integersConstr3 = new HashSet<>(integersConstr);//принимает коллекцию и создаёт сет из уникальных элементов этой коллекции.

        List<Integer>startValues = List.of(15,1,2,3,3,5,6,8,8,15,7,0,16,32,64,33);
        Set<Integer>integers = new HashSet<>(startValues);
        System.out.println("integers" + integers);

//        Set<Integer>integers = new HashSet<>(List.of(15,1,2,3,3,5,6,8,8,15,7,0,16,32,64,33));
//        System.out.println(integers);
//
//        Set<Integer>integersSer = new HashSet<>(List.of(7,6,9,33,10,15,17,1,5));
//        System.out.println(integersSer);
//        Set<String>strings = new HashSet<>(List.of("String","java","Python","hello"));
//        System.out.println(strings);

        Set<Integer>linkedSet = new LinkedHashSet<>(startValues);
        System.out.println(linkedSet);

        //add(Objeckt ob) добавляет
        System.out.println(integers.add(100));//true добавит т.к. такого значения в сете ещё не было.
        System.out.println(integers.add(100));//false не добавит т.к. такое значения в сете уже было.

        // remove(E e) удаляет.(только по значению так как индексов в сетах нет)
        System.out.println("integers.remove(100) "+integers.remove(100));
        System.out.println("integers.remove(100)#2 "+integers.remove(100));

        //boolean contains(Object ob)
        System.out.println("integers.contains(33) "+integers.contains(33));

        //size()
        //empty()
        //iterator() возвращает итератор.
        Iterator<Integer> iterator = integers.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //clear() - удаляет все элементы из set.


        Set<Integer> treeSet0 = new TreeSet<>(); // пустое сортируемое в естественном порядке множество.
        Set<Integer> treeSet1 = new TreeSet<>(integers);
        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
       // Set<Integer> treeSet3 = new TreeSet<>(TreeSet); создает новое множество содержащее те же элементы в том же порядке.

        Set<Integer> treeset = new TreeSet<>(startValues);
        System.out.println(treeset);

        Set<Integer> sortedReversed = new TreeSet<>((i1,i2)->i2.compareTo(i1));
        sortedReversed.addAll(startValues);
        sortedReversed.add(11);
        System.out.println("sortedReversed->" + sortedReversed);

        //
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(4);
//        list.add(4);
//        list.add(1);
//        list.add(5);
//        list.add(6);
//        Set<Integer> set = new HashSet<>(list);
//        List<Integer> unList = new ArrayList<>(set);
//        System.out.println(unList);
        System.out.println(startValues);
        List<Integer>uniqList = getUn(startValues);
        System.out.println("uniqList "+ uniqList);






    }
    public static List<Integer>getUn(List<Integer>list){
        Set<Integer>set = new HashSet<>(list);
        List<Integer>unList = new ArrayList<>(set);
        Collections.sort(unList,Collections.reverseOrder());
        return unList;
    }
    public static List<Integer> getUniqueSortedDescendingList(List<Integer> inputList) {
        Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.addAll(inputList);

        return new ArrayList<>(treeSet);
    }
}
