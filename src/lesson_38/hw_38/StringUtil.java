package lesson_38.hw_38;

import java.util.*;
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
public class StringUtil {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println("Строка до использования метода->[" + testString+" ]");
        System.out.println("Строка после использования метода 1->"+ StringUtil.getUniqueSortedWords(testString));
        System.out.println("Строка после использования метода 2->"+ StringUtil.getUniqueSortedWords2(testString));
    }

    public static List<String> getUniqueSortedWords(String testString) {
        if (testString == null || testString.isEmpty()) {
            return Collections.emptyList();
        }
        String cleanSentence = testString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        Set<String> wordsSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : cleanSentence.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                stringBuilder.append(c);
            } else if (stringBuilder.length() > 0) {
                wordsSet.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }
        if (stringBuilder.length() > 0) {
            wordsSet.add(stringBuilder.toString());
        }
        List <String> wordsList = new ArrayList<>(wordsSet);
        wordsList.sort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
        return wordsList;
    }
    public static TreeSet<String> getUniqueSortedWords2(String testString) {
        if (testString == null || testString.isEmpty()) {
            return new TreeSet<>();
        }

        Comparator<String> lengthThenNaturalOrder = Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder());
        TreeSet<String> words = new TreeSet<>(lengthThenNaturalOrder);

        StringBuilder wordBuilder = new StringBuilder();
        for (char c : testString.toCharArray()) {
            if (Character.isLetter(c)) {
                wordBuilder.append(c);
            } else if (wordBuilder.length() > 0) {
                words.add(wordBuilder.toString());
                wordBuilder.setLength(0);
            }

        }

        if (wordBuilder.length() > 0) {
            words.add(wordBuilder.toString());
        }

        return words;
    }


}
