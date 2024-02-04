package lesson_14.hw;
//Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
// переведенных в верхний регистр. Распечатать полученный результат в методе main
//
//"Hello" -> "EL"
//"He" -> "E"
//"H" -> ???

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
