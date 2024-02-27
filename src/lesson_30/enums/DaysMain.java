package lesson_30.enums;

public class DaysMain {
    public static void main(String[] args) {
        Person person = new Person("John",31,Day.MONDAY);
        System.out.println(person);

        person.setDayWeekOfBirth(Day.SATURDAY);
        String dayStr = person.getDayWeekOfBirth().toString();
        System.out.println(dayStr);

        //получаю массив
        Day[] days = Day.values();

        for (Day day : Day.values()){
            System.out.println(day);
        }
        Day enumMonday = Day.valueOf("MONDAY");
        System.out.println(enumMonday);

        // Сравнение Enum
        System.out.println( enumMonday == Day.MONDAY);

        switch (person.getDayWeekOfBirth()){
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case WEDNESdAY:
                System.out.println("Cреда");
                break;
            case SATURDAY:
                System.out.println("Cуббота");
                break;
            default:
                System.out.println("Какой то другой день недели.");
        }


        // порядковый номер
        System.out.println(Day.SATURDAY.ordinal());
        System.out.println(enumMonday.ordinal());

        System.out.println(enumMonday.getRussian());
        System.out.println(enumMonday.getDayOfWeek());


    }
}
