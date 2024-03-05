package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingExample {
    public static void main(String[] args) {
        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 300);
        cars[4] = new Car("Ferrari", 2021, 300);
        cars[5] = new Car("Alfa", 2021, 150);


        // Статический метод comparing возвращает новый comparator
        // :: -> ссылка на методы. Позволяет ссылаться на метод без его выполнения.
        Comparator<Car>carComparing = Comparator.comparing(Car::getMaxSpeed);
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed));

        // Специализированная версия comparing для сравнения примитивов.

        Arrays.sort(cars, Comparator.comparingInt(Car::getMaxSpeed));
        System.out.println(Arrays.toString(cars));
        System.out.println("==========================================");

        // обратный порядок сортировки.
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed).reversed());
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.reverseOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.naturalOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.nullsFirst(Integer::compareTo)));
        System.out.println(Arrays.toString(cars));

        // сравнить по модели , если одинаковые сравнить по году выпуска.
        Comparator<Car> comparator = Comparator.comparing(Car::getModel).thenComparing(Car::getYear);
        Arrays.sort(cars,comparator);
        System.out.println(Arrays.toString(cars));

        // Реализовать сортировку машин по убыванию макс. скорости если равны отсорт. по возрастанию года
        System.out.println("==========================================================>");
        Comparator<Car> comparator1 = Comparator.comparing(Car::getMaxSpeed).reversed().thenComparing(Car::getYear);
        Arrays.sort(cars,comparator1);
        System.out.println(Arrays.toString(cars));

        System.out.println("==============================================================>");
        // Реализовать сортировку по году выпуска, если год совпадает по убыванию максимальной скорости

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()).thenComparing(Car::getMaxSpeed).reversed());
        System.out.println(Arrays.toString(cars));


    }
}
