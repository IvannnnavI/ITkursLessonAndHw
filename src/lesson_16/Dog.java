package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        System.out.println(" Я ем вкусную косточку");
        weight++;

    }

    void run() {
        while (weight<3){
            System.out.println("Я хочу есть! бежать не могу...");
            System.out.println(" Мой вес : " + weight + ". Надо поесть!");
            eat();
        }

        System.out.println(" Я бегу!");
        weight -= 2;
    }
    String whoIAm(){
        return " I am Dog - " + this.name + " my weight: " + weight;
    }
}
