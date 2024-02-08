package lesson_17;

public class Cat {
    private String test;
    private String name;

    private int age;
    private int weigth;


    public Cat(String test, String name, int age, int weigth) {
        this.test = test;
        this.name = name;
        this.age = age;
        this.weigth = weigth;

    }

    public void sayMeow() {
        System.out.println("Meow!!");
    }

    // геттеры и сеттеры. Это методы возврощоющтк млм мзсеняющие поля класса.

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println(" Hекорректное значение возраста!!!");
        } else {
            this.age = age;
        }
    }
    public void setName (String name){
        if (name != null){
            this.name = name;
        }
    }
}
