package lesson_30.enums.hw_30;

public enum Season {
    WINTER(-5,"'Зима'"),
    SPRING(10, "'Весна'"),
    SUMMER(25, "'Лето'"),
    AUTUMN(15,"'Осень'");
    private int averageTemperature;
    private String russian;

    Season(int averageTemperature, String russian) {
        this.averageTemperature = averageTemperature;
        this.russian = russian;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getRussian() {
        return russian;
    }
}
