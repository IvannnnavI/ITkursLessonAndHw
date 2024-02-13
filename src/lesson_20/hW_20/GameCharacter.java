package lesson_20.hW_20;

public class GameCharacter {
    private String name;
    private int strength;

    public GameCharacter(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
    public String attack(){
        return name + " атакует с силой " + strength;
    }
    public String info() {
        return "Персонаж: " + name + ", Cила атаки: " + strength;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }



}
