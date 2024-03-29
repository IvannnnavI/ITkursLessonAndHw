package lesson_20.hW_20.Task_2;

public class RobotVacuumCleaner extends VacuumCleaner {
    private int batteryLife;

    public RobotVacuumCleaner(int power, String dustCollectionType, String filterType, int batteryLife) {
        super(power, dustCollectionType, filterType);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    public String info() {
        return super.info() + ", автономное время работы: " + batteryLife + " ч.";
    }

}
