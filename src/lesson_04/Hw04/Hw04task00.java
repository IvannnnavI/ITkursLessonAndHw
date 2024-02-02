package lesson_04.Hw04;

public class Hw04task00 {
    public static void main(String[] args) {
        char i = 'и';
        char v = 'в';
        char a = 'а';
        char n = 'н';

//        i = (char) (i - 32);
//        v = (char) (v - 32);
//        a = (char) (a - 32);
//        n = (char) (n - 32);
//        i -= 32 так короче и красивее код.
        i -= 32;
        v -= 32;
        a -= 32;
        n -= 32;


        System.out.println("" + i + v + a + n);



    }
}
