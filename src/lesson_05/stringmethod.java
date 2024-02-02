package lesson_05;

public class stringmethod {
    public static void main(String[] args) {
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        String str4 = "String 4";

//
        String corcaStr = str1 + str2 + str3;
        System.out.println(corcaStr);

        String concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase();
        System.out.println(concatStr2);

        concatStr2 = str1.concat(str3);
        concatStr2 = concatStr2.toUpperCase();
        System.out.println(concatStr2);

        String concatstr3 = str1.concat(str2).concat(str3).concat("");
        System.out.println(concatstr3);

//        метод join
        String concatJoin = String.join(" ",str1, str3, str4);
        System.out.println("concatjoin;" + concatJoin);


        int int1 = 1;
        int int2 = 2;
        System.out.println(int1 + int2 + " Сумма:  " + int1 + int2);
        int age =18;
        System.out.println("My age " + age);

        System.out.println("================================\n");
         String digits = "0123456789";
         int len = digits.length();
        System.out.println(digits.length());
//        взятие символов по его индексу порядковому номеру.
        char firstChar = digits.charAt(0);
        digits = "012345-01-6789-101";
        System.out.println("firstChar: " + firstChar);
        char lastChar = digits.charAt(digits.length() - 1);
//        последний символ в строке имеет индекс (length -1)
        System.out.println("lastChar: " + lastChar);

        String substring = digits.substring(5);// выделяется подстрока с 5 до конца строки.
        System.out.println("substring: " + substring);
        System.out.println(digits); // не меняется
        substring = digits.substring(5, 8); // [ 5...8] до 8 ого индексаю не включителько.
        System.out.println("substring 5-8: "  + substring);

        int index = digits.indexOf('4');
        System.out.println("index " + index);
        index = digits.indexOf("79");
        System.out.println("index: " + index);
        index = digits.indexOf("1");
        System.out.println("index: " + index);
        index = digits.lastIndexOf("1");
        System.out.println("LastIndexOf1; " + index);
        System.out.println(digits.length());


//        boolean isContains("01")

        System.out.println("=================================\n");

        String target = "abcabeabc";
        // zamena
        String output = target.replace("ab", "AB");
        System.out.println("output: " + output);

        output = target.replaceFirst("ab", "AB");
        System.out.println("output: " + output);

        output = target.replace("ab", "AB");
        System.out.println("output: " + output);








   }
}
