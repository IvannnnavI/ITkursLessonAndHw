package lesson_45.hW;

import java.time.LocalDate;
import java.time.LocalTime;

/*
Task 1
Получить и вывести на экран:
текущую дату
Получить и вывести на экран: текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class HW_45_Task1 {
    public static void main(String[] args) {
        // Получить и вывести на экран:текущую дату
        LocalDate today = LocalDate.now();
        System.out.println("Сегодняшняя дата: " + today);

        // Получить и вывести на экран: текущий год, месяц и день
        System.out.println("Год: " + today.getYear());
        System.out.println("Месяц: " + today.getMonth());
        System.out.println("День: " + today.getDayOfMonth());

        //Создать дату, например Ваш день рождения и вывести на экран
        LocalDate birthday = LocalDate.of(1986,1,1);
        System.out.println("День рождения " + birthday);

        // Создать две даты и проверить на равенство
        LocalDate date1 = LocalDate.of(2024,1,1);
        LocalDate date2 = LocalDate.of(2024,1,2);
        System.out.println("Дата 1 и Дата 2 равны? " + date1.equals(date2));

        // Получить и вывести на экран: текущее время/ текущее время + 3 часа
        LocalTime now  = LocalTime.now();
        System.out.println("Текущее время: " + now);
        System.out.println("Текущее время + 3 часа: " + now);

        //Создать дату:
        //которая на неделю позже сегодняшней
        //которая была на год раньше сегодняшней используя метод minus
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastYear = today.minusYears(1);
        System.out.println("Дата на неделю позже сегодняшней: " + nextWeek );
        System.out.println("Дата на год раньше сегодняшней: " + lastYear);

        //Создать дату: которая на год позже сегодняшней
        LocalDate nextYear = today.plusYears(1);
        System.out.println("Дата на год позже сегодняшней: " +nextYear);

        //tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow  = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Tomorrow после сегодня: " + tomorrow.isAfter(today));
        System.out.println("Yesterday до сегодня: " + yesterday.isBefore(today));






    }
}
