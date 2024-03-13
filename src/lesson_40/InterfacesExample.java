package lesson_40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {
    public static void main(String[] args) {
        // Consumer<T> - выполняет операции над объектом типа Т не возвращает никакого результата.
        Consumer<String> printConsumer = t -> System.out.println(t);
        printConsumer.accept("Hello World");

        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = str -> System.out.println("2. " + str + "!");
        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("TEST");

        // Predicate<T> - функция принимает объект типа Т и возврашает boolean
        // этот интерфейс особенно полезен для проверки соответствия неким условиям
        // boolean test(Tt) - основной метод

        Predicate<String> isNotEmpty = str -> !str.isEmpty();
        boolean result = isNotEmpty.test("Hello, World");
        System.out.println(result);

        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 0, 34, -45, 11, 45));
        List<Integer> res1 = getEvenList(list, i -> i < 0);
        System.out.println(res1);
        List<Integer> res2 = getEvenList(list, i -> i % 2 == 0);
        System.out.println(res2);

        Predicate<String> isContainsJava = str -> str.contains("Java");
        Predicate<String> combinePredicate = isNotEmpty.and(isContainsJava);
        System.out.println(combinePredicate.test("Java"));


        // Function<T,R> операции над объектом типа Т возвращающая результат типа К
        // R apply(Tt)
        Function<String,Integer> function = string -> string.length();
        int length = function.apply("Hello,World");
        System.out.println("length" + length);

        Function<String, String> toUpperCase = s->s.toUpperCase();
        Function<String,String> concatenate = s -> s + "!!!";
        Function<String,String > combineFunc = toUpperCase.andThen(concatenate);
        String result1 = combineFunc.apply("Hello");
        System.out.println(result1);


    }

    public static List<Integer> getEvenList(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : integers) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }
}
