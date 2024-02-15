package lesson_22.hW_22.Task_2;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bicycle(), new Motocycle()};
        for(Vehicle vehicle : vehicles)
        {vehicle.startEngine();}


    }
}
