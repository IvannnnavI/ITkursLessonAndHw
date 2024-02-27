package lesson_25.hW_25;

import util.MyList;

import java.util.Arrays;

public class GenericRubberArMain {
    public static void main(String[] args) {
        // Создаем экземпляр RubberArrayHw для хранения Integer
        RubberArrayHw<Integer> integerList = new RubberArrayHw<>();
        MyList<String> stringList = new RubberArrayHw<>();
        MyList<Number> numberList = new RubberArrayHw<>();

        System.out.println("stringList.contains(hello): " + stringList.contains("hello")); // false
        System.out.println("stringList.contains(Hello): " + stringList.contains("Hello")); // true

        integerList.addAll(1, 2, 3, 4, 5, 6, 7);
        System.out.println(integerList);

        Object[] array = integerList.toArray(); //- не работает. Надо чинить
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        System.out.println("\n ================== \n");
        // удалить по значению
        System.out.println(integerList.remove(Integer.valueOf(30)));
        System.out.println(integerList);

        //удалить по индексу
        System.out.println(integerList.remove(1));
        System.out.println(integerList);

        System.out.println("numberList.isEmpty(): " + numberList.isEmpty());
        System.out.println("stringList.isEmpty(): " + stringList.isEmpty());

        numberList.addAll(15, 5.6, -100000, 0, 5.7, 5.7F);
        System.out.println(numberList);

        Object[] strings = stringList.toArray();
        System.out.println(strings);


       Integer[] arrayInt = integerList.toArray(Integer.class);
        System.out.println(Arrays.toString(arrayInt));





    }


}
