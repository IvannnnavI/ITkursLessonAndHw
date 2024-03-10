package lesson_38.hw_38;
/*
Написать метод, возвращающий первый неповторяющийся символ в строке
public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }
    //Output:
    e
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StrUtil {
    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println("Исходная строка: " + string);
        System.out.println("Первый неповторяющийся символ в строке метод 1: " + StrUtil.getFirstUniqueChar(string));
        System.out.println("Первый неповторяющийся символ в строке метод 2: " + StrUtil.getFirstUniqueChar2(string));

    }

    public static char getFirstUniqueChar(String string) {
        for (int i = 0; i < string.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < string.length(); j++) {
                if (i != j && string.charAt(i) == string.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return string.charAt(i);
            }
        }
        return '0';
    }

    public static char getFirstUniqueChar2(String str) {
        Set<Character> allChars = new LinkedHashSet<>();
        Set<Character> repeatChar = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!allChars.add(c)) {
                repeatChar.add(c);
            }
        }
        for (char c : str.toCharArray()) {
            if (!repeatChar.contains(c)) {
                return c;
            }
        }
        return '0';
    }
}
