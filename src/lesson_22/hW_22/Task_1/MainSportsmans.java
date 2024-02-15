package lesson_22.hW_22.Task_1;

public class MainSportsmans {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        System.out.println("====================================>\n");

        AmateurSportsman amateurSportsman = new AmateurSportsman();
        amateurSportsman.run();
        System.out.println("====================================>\n");

        ProffSportsman proffSportsman = new ProffSportsman();
        proffSportsman.run();
    }
}
