package lesson_19.hw_19;
/*
Будем дорабатывать наш класс Dog.
Добавить в класс константу.
 Использовать эту константу в классе.
Добавить в класс поле, в котором будет храниться количество прыжков,
 сделанных всеми объектами класса.
Добавить в класс статический метод,
 возвращающий общее количество прыжков, сделанных всеми собаками
 */

public class Dog2 {
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;
    private static int increasePerOneTraning;
    private static final int DEFAULT_JUMP_INCREASE = 5; // Новая константа для увеличения прыжка
    private static int totalJumps = 0; // Поле для подсчёта общего количества прыжков

    public Dog2(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    static {
        increasePerOneTraning = 10;
    }

    public void jump() {
        System.out.println("Собака " + name + " совершила прыжок");
        totalJumps++; // Увеличиваем общее количество прыжков
    }

    private void training() {
        this.jumpHeight += DEFAULT_JUMP_INCREASE; // Используем новую константу для увеличения прыжка
        this.jumpHeight = Math.min(this.jumpHeight, this.maxJumpHeight);
        jump(); // Прыжок после тренировки
    }

    public static int getTotalJumps() {
        return totalJumps;
    }

    public boolean takeBarier(int barrier) {
        if (jumpHeight >= barrier) {
            jump();
            return true;
        } else {
            if (maxJumpHeight >= barrier) {
                do {
                    training();
                } while (jumpHeight < barrier);
                return true;
            } else {
                System.out.println("Извините этот барьер мне не взять");
                return false;
            }
        }
    }

    public void info() {
        System.out.println("Собака: " + name + " текущий прыжок: " + jumpHeight + " | max = " + maxJumpHeight + ". Общее количество прыжков: " + totalJumps);
    }
}
