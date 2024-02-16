package lesson_23.hW_23;

public class MainGamer {
    public static void main(String[] args) {
        GameCharacter[] characters = {new Warrior("Боромир", 120,100),
                new Mage("Гендальф",70,150),
                new Archer("Леголас",90,99)};

        for (GameCharacter character : characters){
            System.out.println(character.attack());
        }
    }
}
