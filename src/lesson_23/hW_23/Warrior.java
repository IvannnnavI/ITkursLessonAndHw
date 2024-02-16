package lesson_23.hW_23;

public class Warrior extends GameCharacter{
    private int armor;

    public Warrior(String name, int strenght, int armor) {
        super(name, strenght);
        this.armor = armor;
    }

    @Override
    public String attack() {
        return name + " атакует мечом с силой " + strenght + " и броней " + armor;
    }
}
