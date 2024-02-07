package lesson_16;

public class Main16 {
    public static void main(String[] args) {
        Cat catempty = new Cat();
        catempty.whoAmI();



        Cat cat = new Cat("Max");
        Cat cat1 = new Cat("Bear", "black");
        cat1.whoAmI();
        Cat cat2 = new Cat("Freddy","red",4);
        cat2.whoAmI();

    }
}
