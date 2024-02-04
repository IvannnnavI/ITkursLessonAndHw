package lesson_14.hw;
// Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
//
//toUpperCase() использовать низзя.
public class Hw14Task00 {
    public static void main(String[] args) {
        String small = "welcome to the brave new world of java!!!";
        String big = toUppLetters(small);

        String blue = "\u001b[34m";
        String reset = "\u001b[0m";
        System.out.println(blue + big + reset);


    }

    public static String toUppLetters(String small) {
        String result = "";
        for (char lett : small.toCharArray()) {
            if (lett >= 'a' && lett <= 'z') {
                result += (char) (lett - 32);
            } else {
                result += lett;
            }
        }
        return result;
    }
}
