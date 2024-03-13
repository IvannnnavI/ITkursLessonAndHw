package lesson_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Stream API
        // Stream

        // промежуточные методы берут поток и возвращают поток.
        /*
        filter(Predicate<T>) - отфильтровывает элементы , соответствующие данному предикату
        sorted() - сортирует элементы.
        map(Function<T,R> mapper) - преобразует элементы потока с использованием мапера.
        peek(Consumer<T> action) - выполняет действия для каждого элемента потока



        терминальные методы


         */
       // task1();
        //   task2();
        //task3();
        //task4();
        // task5();
        task6();



    }

    private static void task6() {
        // получить список имен кощек которые короче 5 символов.
    }

    private static void task5() {
        List<Cat> cats = getListCats();
        List<String> catNames = cats
                .stream()
                .filter(cat -> cat.getWeight()>4)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(catNames);
    }

    private static void task4() {
        List<Cat> cats = getListCats();
        Stream<String> stringStream = cats
                .stream()
                .map(cat -> cat.getName());
        List<String> catNames = cats
                .stream()// создаем поток
                .map(Cat::getName) // преобразуем поток котов в поток имен
                .collect(Collectors.toList());// собираем.
        System.out.println(catNames);
    }

    private static void task3() {
        List<Cat> cats = getListCats();
        // фильтрация по длине имени.
        // Список котов , чье имя длиннее 4 символов
        Stream<Cat> catStream = cats
                .stream()
                .filter(cat -> cat.getName().length() > 4);

        // пока не запущен терминальный метод промежуточные методы не выполняются.
        List<Cat> catList = catStream.collect(Collectors.toList());

        System.out.println("End TAsk 3 method ");

        // ленивость потока.
    }

    private static void task2() {
        List<Cat>cats = getListCats();
        // список кошек чей вес >4 кг
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList()); // терминальный метод закрывает стрим, после него нельзя использовать поток.
        System.out.println(fatCats);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear",5,"braun"),
                new Cat("Python",7,"white"),
                new Cat("Tiger",3,"gray"),
                new Cat("Panda",4,"black")
        );
    }
    private static void task1 (){
        List<Integer> integers = List.of(-1,12,0,4,1,-15,24,0);
        // cписок положительных и отсортированных
//        List<Integer> result = new ArrayList<>();
//        for (Integer intg : integers){
//            if (intg>0) result.add(intg);
//
//        }
//        Collections.sort(result);
//        System.out.println(result);

        List<Integer> resultStream = integers.stream()  // создаю поток на основе коллекции.
                .filter(integer -> integer > 0)
                .sorted()
                .collect(Collectors.toList());// преобразует элементы потока в список.
        System.out.println(resultStream);


    }
}
