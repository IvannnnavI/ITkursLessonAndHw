package lesson_22.hW_22.Task_1;

public class MainSportsmans {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        System.out.println("====================================>\n");
        Human human1 = new Human();

        AmateurSportsman amateurSportsman = new AmateurSportsman();
        amateurSportsman.run();
        System.out.println("====================================>\n");

        ProffSportsman proffSportsman = new ProffSportsman();
        proffSportsman.run();
        System.out.println(human);
        System.out.println(amateurSportsman);

        System.out.println(human == human1);


    }
}
