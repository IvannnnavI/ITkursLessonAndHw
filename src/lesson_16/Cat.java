package lesson_16;

public class Cat {

    String name;
    String color;
    int age;
    /*
Конструктор в Java - это специальный тип метода, который вызывается автоматически, когда создается новый объект класса.
 Его задача - инициализировать (то есть задать начальные значения) объекту.
 Можно представить, что конструктор - это рецепт или инструкция,
  по которой создается новая игрушка: он говорит, из чего она сделана и как должна выглядеть сразу после создания.
  Если мы говорим о машинке, конструктор может задать ее цвет, размер и марку сразу, как только она "родится" в программе.
  Особенности конструктора
  1. Имя конструктора ВСЕГДА совпадает с названием класса!
  2. Конструктор не имеет возвращаемого типа (даже void не указываем - просто пустое место)
  т.к. конструктор возвращает экземпляр класса.
  3. Конструктор вызывается автоматически при создании объекта.

 */


    public Cat() {
        System.out.println("Construktor1");
        this.name = "Alfred";
        this.color = "yelow";
        this.age = 8;

    }

    public Cat(String name, String color) {
        // Ключевое слово this используется внутри класса, для ссылки или указания на текущий объект.
        this.name = name;
        this.color = color;

    }
    public Cat(String name, String color, int age){
        // this  может использоваться для вызово других конструкторов в том же классе.
        // Можно только в первой строчке тела конструктора
        this(name, color);
        this.age = age;

    }

    public Cat(String catname) {
        System.out.println("Construktor 2");
        name = catname;
    }

    public void whoAmI() {
        System.out.println("Я котик " + name + " , мой возраст: " + age + "; цвет: " + color);
    }

    void sleep() {
        System.out.println("Я сплю");
    }

    void sayMeow() {
        System.out.println("Meow!!!");

    }

    void run() {
        System.out.println("Run");
    }
}
