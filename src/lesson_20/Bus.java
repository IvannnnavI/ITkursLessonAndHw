package lesson_20;

public class Bus extends Vehicle {

    private int capacity;
    int countPassengers;
    int totalPassengersTransported;


    public int getCountPassengers() {
        return countPassengers;
    }

    public int getTotalPassengersTransported() {
        return totalPassengersTransported;
    }
    // Сеттер не нужен. Так как не стоит задача предоставить возможность
    // изменять это значение извне класса.

    public Bus(String model, int yearManufactured, int capacity) {
        // чтобы создать объект нам нужно вызвать конструктор.
        super(model, yearManufactured); // вызов конструктора родителя.
        System.out.println("Конструктор Bus start");
        this.capacity = capacity;

    }

    public boolean takePasseger() {
        // Проверить есть ли место в автобусе
        if (countPassengers < capacity) {
            countPassengers++;
            totalPassengersTransported++;
            System.out.println("Пассажир зашел в автобус" + this.getModel());
            return true;
        }
        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;

    }

    public void getOutPassenger() {
        // Проверить есть ли в автобусе пассажиры.
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса" + this.getModel());
        } else {
            System.out.println("Некому выходить! Никого нет.");
        }
    }


    public int getCapacity() {

        return capacity;
    }

    public void setCapacity(int capacity) {
        //TODO
        this.capacity = capacity;
    }
}
