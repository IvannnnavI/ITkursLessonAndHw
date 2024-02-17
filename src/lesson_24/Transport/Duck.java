package lesson_24.Transport;

public class Duck implements Flyable,Swimmable{
    private String color;

    public String getColor() {
        return color;
    }

    public Duck(String color) {
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("Уточка цвета " + color+ " летит на юг");
    }

    @Override
    public void swim() {
        System.out.println(color + " уточка плывет по озеру");

    }
}
