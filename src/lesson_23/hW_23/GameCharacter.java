package lesson_23.hW_23;

public abstract class GameCharacter {
    protected String name;
    protected int strenght;

    public GameCharacter(String name, int strenght) {
        this.name = name;
        this.strenght = strenght;
    }
    public abstract String attack();

}
