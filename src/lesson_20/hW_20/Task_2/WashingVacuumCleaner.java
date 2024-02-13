package lesson_20.hW_20.Task_2;

import lesson_20.hW_20.Task_2.VacuumCleaner;

public class WashingVacuumCleaner extends VacuumCleaner {
    private int waterTankVolume;

    public WashingVacuumCleaner(int power, String dustCollectionType, int waterTankVolume) {
        super(power, dustCollectionType);
        this.waterTankVolume = waterTankVolume;
    }

    public int getWaterTankVolume() {
        return waterTankVolume;
    }

    public void setWaterTankVolume(int waterTankVolume) {
        this.waterTankVolume = waterTankVolume;
    }
    public String info(){
        return super.info() + ", объем резервуара для воды: " + waterTankVolume + " л.";
    }

}
