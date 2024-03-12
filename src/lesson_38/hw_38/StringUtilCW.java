package lesson_38.hw_38;
/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке
public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class StringUtilCW {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
       // System.out.println(StringUtilCW.getUniqueSortedWords5(testString));

    }
//    public static List<String> getUniqueSortedWords5 (String testString) {
//        String withoutPunchSymbol = testString.replaceAll("[^a-zA-Z0-9А-Яа-я ]","");
//        System.out.println(withoutPunchSymbol);
//
//        String[] words = withoutPunchSymbol.split("\\s+");
//        System.out.println(Arrays.toString(words));
//
//        Set<String> uniqWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
//        uniqWords.addAll(Arrays.asList(words));
//        return List.of("");
//
//    }
}
