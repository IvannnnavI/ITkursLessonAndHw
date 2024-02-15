package lesson_22.hW_22.Task_1;

public class Human {
    private int speed = 10;
    private int restTime = 15;

    public void run() {
        System.out.println("Я бегаю со скоростью " + speed + " км/ч.");
        printRestTime();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    void printRestTime() {
        System.out.println("Мне нужно отдохнуть после пробежки - " + restTime + " минут.");
    }
}
