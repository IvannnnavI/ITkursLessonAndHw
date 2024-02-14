package lesson_21;

public class AutoParkMain {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("LN-16435843");
        Autobus bus = new Autobus(busDriver,25);
        System.out.println(bus.toString());
        BusDriver busDriver1 = new BusDriver("AE435462");
        bus.setDriver(busDriver1);
        System.out.println(bus.toString());

        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Jim");
        Passenger passenger2 = new Passenger("Bim");
        Passenger passenger3 = new Passenger("Bill");
        Passenger passenger4 = new Passenger("Flo");
        Passenger passenger5 = new Passenger("Bro");
        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger(passenger5);
        System.out.println(bus.createStringPassengersList());

    }
}
