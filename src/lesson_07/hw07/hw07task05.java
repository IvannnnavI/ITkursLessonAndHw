package lesson_07.hw07;

// Программа просит пользователя слово "hello" Если пользователь вводит правильное слово - программа распечатывает
// на экран благодарность и завершает работу
// Если вводится не верное слово - программа просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово
//
//*опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова
// По окончанию - вывести число попыток на экран

import java.util.Scanner;

public class hw07task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemptcount = 0;
        while (true) {
            System.out.println("Введите слово 'hello': ");
            String input = scanner.nextLine();
            attemptcount++;
            if ("hello".equals(input)) {
                System.out.println("Спасибо!");
                break;
            }
        }
        System.out.println("Колличество попыток: " + attemptcount);
        scanner.close();
    }
}
