package lesson_16;

public class MainDogs {
    public static void main(String[] args) {
        Dog dog = new Dog("Boss!" , 7);
        System.out.println(dog.whoIAm());

        dog.run();
        dog.run();
        dog.run();
        dog.run();
        System.out.println("=========================>");
        System.out.println(dog.whoIAm());


    }

}
