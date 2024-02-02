package lesson_07;

public class whileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;

        }
        int i1 = 1;
        while (i1 <= 21) {
            if (i1 % 2 == 0) {
                System.out.println(i1);
            }
            i1++;
        }
    }

}
