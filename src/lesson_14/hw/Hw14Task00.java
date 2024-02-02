package lesson_14.hw;

public class Hw14Task00 {
    public static void main(String[] args) {
        String small = "welcome to the brave new world of java!!!";
        String big = toUppLetters(small);

        String green = "\u001b[34m";
        String reset = "\u001b[0m";
        System.out.println(green + big + reset);


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
