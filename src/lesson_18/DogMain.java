package lesson_18;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 50);
        dog.info();
        System.out.println("барьер 30 см: - " + dog.takeBarier(30));
        System.out.println("барьер 70 см: - " + dog.takeBarier(70));
        System.out.println("барьер 120 см: - " + dog.takeBarier(120));
        System.out.println("==============================================\n");
        Dog dog1 = new Dog("Bim",44);
        System.out.println(dog1.takeBarier(85));


    }



}
