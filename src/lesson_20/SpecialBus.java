package lesson_20;

public class SpecialBus extends Bus{
    private int bicyclePlaces;
    private int bicyclesCount;


    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public boolean takePassengerWithBicycle(){
        // есть ли место для
        // пассажира.
        // велика
        // есть на борт.
        // нет никого не садим
        if (bicyclesCount < bicyclePlaces) {
            bicyclesCount++;
            return true;
        }else {
            return false;

        }

    }
    public int getBicyclePlaces() {
        return bicyclePlaces;
    }

    public void setBicyclePlaces(int bicyclePlaces) {
        this.bicyclePlaces = bicyclePlaces;
    }
    public int getBicyclesCount() {
        return bicyclesCount;
    }
    public int example() {
        return super.getCapacity();
    }


}
