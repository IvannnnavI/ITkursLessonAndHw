package lesson_21;

public class Autobus {
    //  Для создания связи типа  has a  мы определяем поле класса
    //которое будет хранит ссылку на объект другого класса.
    // направленность связи - однонаправленная или двунаправленная связь

    /*
    Кардинальность определяет сколько объектоа одного класса, может быть ассоциировано
    с объектом другого класса.

    Один к одному: Автобус и двигатель. Один Автобус - Один двигатель и наоборот.
    Один ко многим:Автобус и пассажиры. 1 Автобус перевозит много пассажиров.
    Многие ко многим: Список Автобусов и список остановок.
    Каждая остановка может обслуживать множество автобусов.
     */

    private BusDriver driver; // агрегация "мягкая" связь
    private final AutoPilot autoPilot; // композиция . неразрывная связь.
    private int capasity;
    //ОРГанизуем связь пассажиров с автобусом.
    private final Passenger[] passengers;
    private int countPassenger;


    public Autobus(BusDriver busDriver, int capasity) {
        this.driver = busDriver;
        busDriver.setAutobus(this);
        autoPilot = new AutoPilot("AP- 005");
        this.capasity = capasity;
        this.passengers = new Passenger[capasity];
    }

    // посадка пассажиров в автобус
    public boolean takePassenger(Passenger passenger) {
        //проверяет место.
        //Если есть, пассажира добавить в автобус.
        // Вернуть boolean - дающий отчет об успешности посадки

        if (countPassenger < capasity) {
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир сел в автобус! ");
            return true;
        } else {
            System.out.println("Мест нет пассажира посадить не удалось");
            return false;
        }

    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
        driver.setAutobus(this);
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus: { driver: ");
        sb.append(driver.getLicenceNumber()).append("; autopilot: ").append(autoPilot.getSoftwareVersion())
                .append("; passenger: ").append(createStringPassengersList()).append(" }");
        return sb.toString();
    }

    public String createStringPassengersList() {
        // Перебрать список пассажиров. Присвоить к строке пассажира ай ди.
        // т.к пассажир ссылочный тип данных приклеить только не null ссылки
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                Passenger current = passengers[i];
                sb.append("Passenger: {id: ").append(current.getId()).append("; name: ").append(current.getName()).append("}");
                sb.append("; ");
            }

        }
        sb.append("}");

        return sb.toString();
    }
}
/*
Посадка
Высадка
Список пассажиров.
 */