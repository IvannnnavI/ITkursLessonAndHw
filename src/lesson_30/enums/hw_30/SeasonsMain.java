package lesson_30.enums.hw_30;

public class SeasonsMain {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println("Средняя температура за сезон " + season.getRussian() + " " + season.getAverageTemperature() + " градусов Цельсия.");

        System.out.println("==============================================================>");

        for (Season seasons : Season.values()) {
            System.out.println("Средняя температура за сезон " + seasons.getRussian() + " " + seasons.getAverageTemperature() + " градусов Цельсия.");
        }
    }


}
