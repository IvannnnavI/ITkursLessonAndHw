package lesson_14.hw;

public class Hw14Task04 {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(secondThirdToupper(input));


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
    public static String secondThirdToupper(String input) {
        if (input.length()< 2) {
            return "???";
        }else if (input.length() == 2){
            return toUppLetters(input.substring(1, 2));
        }else {
            return toUppLetters(input.substring(1, 3));
        }
    }
}
