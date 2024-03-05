package lesson_36;

// имплементация comparator - позволяет сравнить 2 объекта.

import java.util.Comparator;

public class CarSpeedComparator  implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }

    //a < b -> если метод вернул отрицательное значение
    // a > b -> если метод вернул положительное значение
    // a = b -> если метод вернёт 0
}
