package lesson_22;

public class Cat extends Animal{
    @Override
    public void makevoice() {
        System.out.println("Cat say MEOW!!");
    }

    public void eat(){
        System.out.println("Cat eating");
    }

}
