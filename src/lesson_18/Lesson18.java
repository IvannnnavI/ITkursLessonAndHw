package lesson_18;

public class Lesson18 {
    public static void main(String[] args) {
        int sum = MathUtils.sumOfInts(1, 4, 5, 6);
        System.out.println("sum =" + sum);

        Car car = new Car("TEST", 100);
        Car car2 = new Car("TEST2",500);
        car.info();
        System.out.println(Car.getCountCar());
    }
    /*
    1. Не статические методы могут обращаться к нестатическим полят и методам.
    2. Не статические методы могут обращаться к статическим полям и методам.
    3. Статические методы могут обращаться к статическим полям и методам
    4. Статические методы
     */
}
