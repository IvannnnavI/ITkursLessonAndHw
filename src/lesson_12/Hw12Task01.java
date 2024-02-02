package lesson_12;

//Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива

public class Hw12Task01 {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java", "Code", "New", "String"};
        String[] result = ShortestAndLongestStrings(strings);

        System.out.println("{" + result[0] + ", " + result[1] + "}");

    }

    public static String[] ShortestAndLongestStrings(String[] strings) {
        if (strings == null || strings.length == 0)
            return new String[]{};

        String shortest = strings[0], longest = strings[0];
        for (String str : strings) {
            if (str.length() < shortest.length()) shortest = str;
            if (str.length() > longest.length()) longest = str;
        }
        return new String[]{shortest, longest};
    }

}
