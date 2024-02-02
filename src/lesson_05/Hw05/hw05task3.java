package lesson_05.Hw05;

public class hw05task3 {
    public static void main(String[] args) {
        String str1 = "string";
        String str2 = "code";
        String str3 = "Practice";

        int middleindex = str2.length()/2;

//  мульти курсор держим шифт + альт тыкаем левой кнопкой мыши.
        System.out.println("Два средних символа в '" + str1 + "': "+ str1.charAt(str1.length() / 2 - 1) + str1.charAt(str1.length() / 2));
        System.out.println("Два средних символа в '" + str2 + "': "+ str2.charAt(str2.length() / 2 - 1) + str2.charAt(str2.length() / 2));
        System.out.println("Два средних символа в '" + str3 + "': "+ str3.charAt(str3.length() / 2 - 1) + str3.charAt(str3.length() / 2));

        String substring = str2.substring(middleindex-1,middleindex + 1);
        System.out.println("substring: " + substring);
    }
}
