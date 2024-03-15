package lesson_42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataChange {
    public static void main(String[] args) {
        /*
        .map(Function mapper) - преобразует элементы потока используя маппер.

        .flatMap(Function<T,R> mapper) - преобразует каждый элемент потока в поток других объектов, а затем все потоки склеивает в один поток.

        .mapToObj(IntFunction mapper) - преобразует тип данных в сылочный при помощи заданной функции.

        .boxed() используется для преобразования примитивных типов данных в соответствующий оберточный класс.

        mapToInt
        MapTo Long



         */
       // task1();

       // task2();
        task3();

      //  task4();
    }

    private static void task3() {
        // получить список всех символов
        String [] strings = {"Abcd", "bbbbb" , "string", "hello world"};

        // String.chars () -> IntStream - поток интов.(int)
        List<Character> characterList = Arrays.stream(strings)
                .flatMapToInt(string -> string.chars())
                .peek(e -> System.out.println("e->" + e))
                .mapToObj(i -> (char) i)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(characterList);

    }

    private static void task4() {
        String [] strings = {"Abcd", "bbbbb" , "string", "hello world"};
        int [] lengths = Arrays.stream(strings)
                .mapToInt(String::length)
                .toArray();
        System.out.println(Arrays.toString(lengths));
    }

    private static void task2() {
        int [] ints = new int[] {1,2,3,4,5,6,7};
        // преобразовать массив интов в список Интеджер.
        List<Integer> integers = Arrays.stream(ints)
               // .mapToObj(i->i)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(integers);

        // получить из Интегер получить массив примитивов
        int [] ints1 = integers
                .stream()
                .mapToInt(i->i)
                .toArray();
        System.out.println(Arrays.toString(ints1));

    }

    private static void task1() {
        // получить список продуетов представленный в магазинах.
        Shop shop = new Shop("Shop1", List.of("Orange","Banana","Apple"));
        Shop shop1 = new Shop("Shop2", List.of("Lime","Cherry","Apple"));
        Shop shop2 = new Shop("Shop3", List.of("Grape","Lemon","Apple"));

        Shop [] shops = {shop,shop1,shop2};

        List<String> products = Arrays.stream(shops)
                .flatMap(currentShop -> currentShop.getProducts().stream())
                .collect(Collectors.toList());

        System.out.println(products);
    }
}
