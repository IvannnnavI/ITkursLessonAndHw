package lesson_24.Transport;

public class MainApp {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(150);
        Boat boat = new Boat(40);
        Duck duck = new Duck("Yelow");

        Flyable[]flyers = new Flyable[2];
        flyers[0] = airplane;
        flyers[1] = duck;

        for (Flyable flyer : flyers) {
            flyer.fly();

            if (flyer instanceof Airplane) {
            Airplane airplaneCurrent = (Airplane) flyer;
            System.out.println("Вместимость самолета " + airplaneCurrent.getCapacity());
            airplaneCurrent.takePassenger();
            }
        }

        Swimmable[] swimmers = new Swimmable[3];
        swimmers[0] = boat;
        swimmers[1] = duck;
        swimmers[2] = new Duck("White");

        for (Swimmable swimmer : swimmers) {
            swimmer.swim();

            if (swimmer instanceof Duck) {
                Duck duck1 = (Duck) swimmer;
                System.out.println("Я утка с цветом " + duck1.getColor());
            }
        }
    }
}
