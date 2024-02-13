package lesson_18;
/*
Написать класс Собака.
Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака,
 не может быть больше, чем двукратная высота первоначального прыжка.
Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера.
 Если собака в состоянии преодолеть этот барьер - прыгает.
  Если не в состоянии, нужно проверить помогут ли тренировки
  (будет ли данная собака в принципе в состоянии взять барьер).
   Если да -> идем тренироваться -> берет барьер
 */

public class Dog {
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;
    private static int increasePerOneTraning;


    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    static {
        increasePerOneTraning = 10;
    }

    public void jump() {
        System.out.println("Собака " + name + " совершила прыжок");
    }

    private void training() {
        this.jumpHeight += increasePerOneTraning;
        jumpHeight = Math.min(jumpHeight,maxJumpHeight);

    }

    public boolean takeBarier(int barrier) {
        if (jumpHeight >= barrier) {
            System.out.println(name + "прыжок: " + jumpHeight + " : барьер; " + barrier + "| начало метода барьер.");
            jump();
            return true;
        } else {
            if (maxJumpHeight >= barrier) { // есть ли смысл тренироваться.
                do {
                    training();
                } while (jumpHeight < barrier);
                jump();
                System.out.println("maxJumpHeight >= barrier : true -> " + name + " прыжок " + jumpHeight + "; барьер " + barrier);
                return true;
            } else {// Тренировки лишины смысла.
                System.out.println("Извините этот барьер мне не взять");
                System.out.println("maxJumpHeight >= barrier : FALSE -> " + name + " прыжок " + jumpHeight + "; барьер " + barrier);
                return false;
            }

        }
    }


    public void info() {
        System.out.println("Cобака: " + name + " текущий прыжок: " + jumpHeight + " | max = " + maxJumpHeight);
    }
}
