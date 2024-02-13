package lesson_20.hW_20;

public class VacuumCleaner {
    private int power;
    private String dustCollectionType;
    public VacuumCleaner(int power, String dustCollectionType) {
        this.power = power;
        this.dustCollectionType = dustCollectionType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDustCollectionType() {
        return dustCollectionType;
    }

    public void setDustCollectionType(String dustCollectionType) {
        this.dustCollectionType = dustCollectionType;
    }
    public String info() {
        return "Пылесос мощностью " + power + " Вт , тип сбора пыли: " + dustCollectionType;
    }

}
