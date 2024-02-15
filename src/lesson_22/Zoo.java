package lesson_22;

public class Zoo {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.makevoice();
        Cat cat = new Cat();
        cat.makevoice();

        Hamster hamster = new Hamster();
        hamster.makevoice();

        Dog dog = new Dog();
        dog.makevoice();
        // Переопределение методов
        // Method Override - динамический полиморфизм - время выполнения (Runtime)

        // Статический полиморфизм (компиляционный) - перегрузка методов.

        System.out.println(animal);
        System.out.println(hamster);

    }
}
