package lesson_23.hW_23;

public  class Archer extends GameCharacter {
    private int accuracy;

    public Archer(String name, int strenght, int accuracy) {
        super(name, strenght);
        this.accuracy = accuracy;
    }

    @Override
    public String attack() {
        return name + " cтреляет с меткостью " + accuracy;
    }
}
