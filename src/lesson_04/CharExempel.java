package lesson_04;

public class CharExempel {
    public static void main(String[] args) {
        char a = 'A'; // peremennaya xranit A
        char a1 = 65;
        char a2 = 0x0041;// 4islo v 16 ri4noy systeme
        char a3 = '\u0041';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);


        char digit0 = 48;
        System.out.println("digit0:" + digit0);
        digit0++;
        digit0 += 4;
        System.out.println("digit0:" + digit0);

        char symbolZ = 90;
        System.out.println("symbolZ: " + --symbolZ);

        char smallA = 97;
        System.out.println("smallA: " + smallA);
        smallA = (char) (smallA + 10);
        System.out.println("smallA: " + smallA);

        // Переполнение типов данных
        // byte -128..127

        byte bt = 127;
        System.out.println("bt: " +bt);
        bt += 10;
        System.out.println("bt: " +bt);

        bt = -128;
        bt--;
        System.out.println("bt: " +bt);




    }
}
