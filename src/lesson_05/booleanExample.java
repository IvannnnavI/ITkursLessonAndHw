package lesson_05;

public class booleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bol1;
        bol1 = true;
        bol1 = false;
//        CpaBHEHIE
        bol1 =x == y; // x=y.-> he BEPHO
        System.out.println("x == y -> " + bol1);

        bol1 = x == 10; // X=10 BEPHO
        System.out.println("x == 10 -> " + bol1);

        // сравнение на неравенство !=
        boolean bol2 = x != y;
        System.out.println("x != y -> " + bol2);
        bol2 = 10 != x;
        System.out.println("x != 10 -> " + bol2);

        // больше чем >
        boolean bol3 = x > y;
        System.out.println("x > Y -> " + bol3);
        bol3 = x > 10;
        System.out.println("x > 10 -> " + bol3);

        // >=
        boolean bol4 = x >= y;
        System.out.println("x >= y -> " + bol4);
        bol4 = x >= 10;
        System.out.println("x >= 10 -> " + bol4);

        // <
        boolean bol5 = x < y;
        // <=
        boolean bol6 = x <= 10;
        System.out.println("x <= y  -> " + bol6);

        // логическое отрицание

        boolean bol7 = true;
        System.out.println("true: " + bol7);
        bol7 = !true;
        System.out.println("!true: " + bol7);
        System.out.println("!false " + !false);

        System.out.println("(4==5) -> " + !(4==5));

        // & Логическое И -
        // Рим столица Италии И Берлин столица Англии -Ю

        boolean bol8 = (2 < 5) & (11 == 10);
        System.out.println("(2 < 5) & (11 == 10) - >" + bol8);

        // | - logi4eskoe ILI -> возвращает тру если хотя бы одна часть тру.

        boolean bol9 = (2 < 5) | (11 == 10);
        System.out.println("(2 < 5) | (11 == 10) - >" + bol9);









    }
}
