package lesson_24.printers;

public interface Printable {

    int power = 220;

    void print();
// методы по умолчанию
    default void sayHello(String string) {
        System.out.println("Hello, " + string + " ; " + power);
        privateMethod();
    }

    // Статические методы
    static void staticMethod(){
        System.out.println("I am static");
        staticPrivat();
    }
    private static void staticPrivat(){
        System.out.println("Iam staticPrivat");

    }

    private void privateMethod(){
        System.out.println("i am private");
    }


}
