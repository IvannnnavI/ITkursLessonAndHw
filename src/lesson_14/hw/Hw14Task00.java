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
        //  Проверки ! всегда помнить о проверках входящих аргументов!
        // Перебрать строку, если встречается нижний регистр, вернуть верхний.
        if (small == null) return null;
        // преобразовать строку в массив char
        // Перебрать символы . Если нужно на соотвествующий символ в верхнем регистре.
        // Сформировать из массива char строку и вернуть из метода.
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
