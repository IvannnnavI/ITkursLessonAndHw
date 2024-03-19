package lesson_45.hW;
/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней между
 самой ранней и поздней датами в этом списке
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;

public class HW_45_Task2 {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2024,1,1),
                LocalDate.of(2024,2,2),
                LocalDate.of(2024,3,3)

        );
        System.out.println("Количество дней между самой ранней и поздней датами в этом списке: " + getDayBetweenDates(dates));

    }
    public static long getDayBetweenDates (List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new
                    IllegalArgumentException("Список дат не может быть пустым");
        }

        LocalDate minDate  = dates.stream().min(Comparator.naturalOrder()).get();
        LocalDate maxDate = dates.stream().max(Comparator.naturalOrder()).get();

        return ChronoUnit.DAYS.between(minDate,maxDate);
    }
}
