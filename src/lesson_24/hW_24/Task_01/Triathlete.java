package lesson_24.hW_24.Task_01;
/*
Создайте интерфейсы Swimmer и Runner с методами swim и run соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */
public class Triathlete implements Runner,Swimmer {
    @Override
    public void run() {
        System.out.println("Триатлет бежит.");
    }

    @Override
    public void swim() {
        System.out.println("Триатлет плывёт.");

    }
}
