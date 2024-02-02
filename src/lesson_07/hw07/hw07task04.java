package lesson_07.hw07;

// Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while

public class hw07task04 {
    public static void main(String[] args) {
        int i = 1, count = 0;
        while (i <= 100 && count < 7) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
                i += 5;
            } else {
                i++;

            }
        }
    }
}
