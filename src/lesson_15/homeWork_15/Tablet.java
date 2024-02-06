package lesson_15.homeWork_15;

public class Tablet {
    String marka;
    String model;
    int yearOfRelease;

    public Tablet(String tabletMarka, String tabletModel, int tabletYearOfRelease) {
        marka = tabletMarka;
        model = tabletModel;
        yearOfRelease = tabletYearOfRelease;
    }

    public void surfTheIntrnet() {
        System.out.println(marka + model + yearOfRelease + " используется для Интернет Сёрфинга.");
    }

    public void watchVideos() {
        System.out.println(marka + model + yearOfRelease + " используется для просмотра видео.");
    }
}
