package lesson_08.hw08;

// Дан массив строк. Вывести на экран все символы из самой длинной строки массива
//
//{ “One”, “Two”, “Twenty” } -->
//
//  T
//  w
//  e
//  n
//  t
//  y


public class Hw08Task05 {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Twenty"};
        String longestString = "";
        int l = 0;

        System.out.print("{ ");
        while (l < array.length) {
            System.out.print("\"" + array[l] + "\"");
            if (l < array.length - 1) {
                System.out.print(", ");
            }

            if (array[l].length() > longestString.length()) {
                longestString = array[l];
            }
            l++;
        }
        System.out.println("} -->");
        System.out.println();
        l = 0;
        while (l < longestString.length()) {
            System.out.println(longestString.charAt(l));
            l++;
        }
    }
}
