package lesson_19.hw_19;

import lesson_18.Dog;

public class DogMain2 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2("Max", 50);
        dog.info();
        System.out.println("Общее количество прыжков до тренировки: " + Dog2.getTotalJumps());
        System.out.println("барьер 30 см: - " + dog.takeBarier(30));
        System.out.println("барьер 70 см: - " + dog.takeBarier(70));
        System.out.println("барьер 120 см: - " + dog.takeBarier(120));
        System.out.println("==============================================\n");
        Dog2 dog1 = new Dog2("Bim", 44);
        System.out.println(dog1.takeBarier(85));
        System.out.println("Общее количество прыжков после тренировки: " + Dog2.getTotalJumps());
        dog.info();
        dog1.info();
        System.out.println(Dog2.getTotalJumps());
        Dog2 dog2 = new Dog2("Sharik", 8);
        System.out.println(dog2.takeBarier(20));

        System.out.println(Dog2.getTotalJumps());


    }


}
