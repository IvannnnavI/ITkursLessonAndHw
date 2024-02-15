package lesson_22;

public class Hamster extends Animal{
    @Override// аннотация
    public void makevoice() {
        System.out.println("Hamster say Good bye!!");
    }

    // Перегрузка = статический полиморфизм.
    public void makevoice(String string){
        System.out.println("Hamster say: " + string);

    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
