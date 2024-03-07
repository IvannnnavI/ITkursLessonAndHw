package lesson_37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Str1","Str2","Str3","Str4"));

        /*
        Конструкторы класса ArrayList
        ArrayList(); создает пустой список Размер внутреннего массива = 10
        ArrayList(capacity) - Пустой список , но внутренний массив размер capacity
        ArrayList(Collection<? extends T> col) -> Создает список содержащий элементы указанной коллекции
        в том порядук, в котором они возращаются Итератором коллекции.
         */

        // Метод of - статический метод представлен в нескольких интерфейсах JCF начиная с JDK9.
        // эти методы предназначены для создания неизменяемых коллекций.
        // List Set Map
        // null ломает метод of

        List<Integer> integers = List.of(1,2,3,4,5);
        System.out.println(integers);

        System.out.println(strings);
        strings.addAll(List.of("String","Java","Python"));
        System.out.println(strings);

        // get(int index) - взятие элемента по индексу.
        System.out.println(strings.get(3));

        //
        System.out.println(strings.indexOf("Java"));
        System.out.println(strings.lastIndexOf("Java"));

        //sort(Comparator<? superT> comparator)
        strings.sort(Comparator.comparing(String::length));
        System.out.println(strings);

        //List<T>subList (int from, int to) - > возращает вид на часть списка с индекса from до (to-1)

        List<String> subList = strings.subList(1,4);
        System.out.println(subList);




    }
}
