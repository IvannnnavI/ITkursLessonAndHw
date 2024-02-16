package lesson_23.hW_23;

public class Mage extends GameCharacter {
    private int magicPower;

    public Mage(String name, int strenght, int magicPower) {
        super(name, strenght);
        this.magicPower = magicPower;
    }

    @Override
    public String attack() {
        return name + " использует заклинание с магической силой " + magicPower;
    }
}
