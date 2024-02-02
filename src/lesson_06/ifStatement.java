package lesson_06;

public class ifStatement {
    public static void main(String[] args) {
        // оператор блок. Определяет область видимости переменной.
//        int x = 10;
//
//        {
//            int y = 5;
//            x = x + y;
//        }


//        System.out.println("x: " + x);
        int number = 3;
//        if (number > 10) System.out.println("X больше 10");
        if (number > 10) {
            System.out.println("Всем привет!!");
            System.out.println("Cейчас х > 10");

        } else if (number >7) {
            System.out.println("ELSE-IF");
            System.out.println("X > 7");
        }
        else {
            System.out.println("Я ущел");
            System.out.println("Сейчас х не больше 10 и даже не больше 7");
        }
        if (number < 10) System.out.println("Конец тебе!!!");

    }
}
