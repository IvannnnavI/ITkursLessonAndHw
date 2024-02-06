package lesson_15;

//  Значения по умолчанию:
//  ссылочные типы данных - null;
//  числовые примитивы 0 (0.0)
//  boolean - false.

public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat(); //  Создаём объект класса Cat
        // Cat() -  вызов конструктора класса
        cat.sayMeow();
        cat.run();
        cat.sleep();

        // При создании объекта класса, все его поля
        // инициализируються значениями по умолчанию ( конструктор)

        String catName = cat.name;
        System.out.println("Имя кота 1: " + catName);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цвет кота: " + cat.color);

        //  Создаем ещё один объект класса Cat
        Cat cat1 = new Cat("Max");

        cat1.run();
        cat1.sleep();
        System.out.println("Имя кота: " + cat1.name);
        System.out.println("Возраст кота: " + cat1.age);

        cat.whoAmI();
        cat1.whoAmI();

    }

}
