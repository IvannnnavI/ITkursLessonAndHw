package lesson_20.hW_20;

public class Mage extends GameCharacter {
    private int magicPower;

    public Mage(String name, int strength, int magicPower) {
        super(name, strength);
        this.magicPower = magicPower;
    }
    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public String attack() {
        return super.attack() + " и использует магию с силой " + magicPower;
    }
    public String info () {
        return super.info() + ", Магическая сила: " + magicPower;
    }

}
