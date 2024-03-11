package lesson_39.hw;

import java.util.HashMap;
import java.util.Map;

/*
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
 где каждому слову соответствует количество его вхождений в текст.
Task2
Опционально:
Напишите метод, возвращающий частотный словарь вхождения символов в строку
 */
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.print(key+" - " + value+ " р.: "));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "p.; "));
        System.out.println();

    }


    private static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words){
            word = word.replaceAll("[^а-яА-я]+","");
            if (!word.isEmpty()) {
                wordCount.put(word,wordCount.getOrDefault(word,0)+1);
            }
        }
        return wordCount;
    }
    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character , Integer> charCount = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (!Character.isWhitespace(ch)){
                charCount.put(ch,charCount.getOrDefault(ch,0)+1);
            }
        }
        return charCount;
    }
}
