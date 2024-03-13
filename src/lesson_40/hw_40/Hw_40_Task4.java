package lesson_40.hw_40;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Дан список строк. Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "B"),
 удалите дубликаты и отсортируйте их в алфавитном порядке.
 */
public class Hw_40_Task4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Вода", "Водка", "Вилы", "Вилка", "Вино", "Вода", "Водка", "Вилы", "Вилка", "Аджика", "Сало"));
        System.out.println(strings);
        System.out.println(filterAndSorted(strings, "В"));

    }

    public static List<String> filterAndSorted(List<String> strings, String startingLetter) {
        return strings.stream()
                .filter(s -> s.startsWith(startingLetter))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
