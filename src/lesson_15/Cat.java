package lesson_15;

// Имя , цвет, возраст
// мяукать, спать , бежать


public class Cat {
    String name;
    String color;
    int age;

    public Cat (){
        System.out.println("Construktor1");

    }
    public Cat (String catname) {
        System.out.println("Construktor 2");
        name = catname;
    }
    public void whoAmI() {
        System.out.println("Я котик " + name + " , мой возраст: " + age + "; цвет: " + color);
    }

    void sleep() {
        System.out.println("Я сплю");
    }
    void sayMeow(){
        System.out.println("Meow!!!");

    }
    void run () {
        System.out.println("Run");
    }
}
