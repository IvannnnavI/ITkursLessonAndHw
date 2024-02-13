package lesson_20.hW_20.Task_2;

import lesson_20.hW_20.Task_2.GameCharacter;

public class Warrior extends GameCharacter {
    private int armor;


    public Warrior(String name, int strength, int armor) {
        super(name, strength);
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public String attack() {
        return super.attack() + " и имеет броню " + armor;
    }
    public String info(){
        return super.info() + ", Броня: " + armor;

    }
}