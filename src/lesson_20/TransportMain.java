package lesson_20;

public class TransportMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Телега", 1910);
        System.out.println(vehicle.toString());
        vehicle.go();
        vehicle.stop();
        System.out.println("==========================\n");

        Bus bus = new Bus("Man", 2020, 3);
        System.out.println(bus.toString());
        bus.go();
        bus.stop();

        System.out.println("Пассажиров в автобусе: " + bus.getCapacity());
        System.out.println("===========================\n");
        bus.getOutPassenger();
        bus.takePasseger();
        bus.takePasseger();
        bus.takePasseger();
        System.out.println("Пассижиров стало: " + bus.getCountPassengers());
        bus.takePasseger();
        bus.getOutPassenger();
        bus.getOutPassenger();
        bus.takePasseger();
        bus.takePasseger();
        bus.getTotalPassengersTransported();
        System.out.println(bus.getTotalPassengersTransported());


        System.out.println("==============================\n");
        Train train = new Train("Express-1", 2024, 3);
        System.out.println(train.toString());
        train.go();
        train.stop();
        System.out.println(train.getWagonCounter());
        System.out.println("\n==================================\n");

        SpecialBus specialBus = new SpecialBus("Ikarus", 1978, 45, 3);
        specialBus.go();
        System.out.println(specialBus.toString());

        specialBus.takePasseger();
        specialBus.getOutPassenger();
        specialBus.getOutPassenger();

        System.out.println(specialBus.example());


    }
}
