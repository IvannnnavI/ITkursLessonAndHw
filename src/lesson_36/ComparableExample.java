package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample {
    public static void main(String[] args) {
        int[] ints = {9, 5, 1, 3, 4, 2, 6, 7, 0};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 300);
        cars[4] = new Car("Ferrari", 2021, 300);

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        // Comparable<E> - сравнивый
        // Comparator<E>
        CarSpeedComparator speedComparator = new CarSpeedComparator();

        Arrays.sort(cars, speedComparator);

        System.out.println(Arrays.toString(cars));

        String[] strings = {"Zbbbb", "Сссссс", "Öbbbbbb", "Ффффффф", "бббббб"}; // Z<a
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Integer[] integers = {4, 5, 7, 8, 1, 0, 34};
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getMaxSpeed() - car2.getMaxSpeed();
            }
        });

        System.out.println(Arrays.toString(cars));

        // Функциональный интерфейс. - интерфейс в котором есть только 1 абстрактный метод


        // Лямбда выражения - способ короткой записи анонимных функций(методов)
        //(parameters) -> expression
        //(parameters) -> {statements;}
        Arrays.sort(cars, (car1, car2) -> car1.getMaxSpeed() - car2.getMaxSpeed());
        System.out.println(Arrays.toString(cars));

        System.out.println("============================================>");

        // сравнить модели по году выпуска, если год выпуска одинаковый то сравнить оьбъекты по модели

        Arrays.sort(cars, (car1, car2) -> {
            //         int yearCompare = car1.getYear()- car2.getYear()
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());
            if (yearCompare != 0) {
                return yearCompare;
            } else {
                // если года одинаковые , то сравниваем модели
                return car1.getModel().compareTo(car2.getModel());
            }

        });
        System.out.println(Arrays.toString(cars));


    }


}
