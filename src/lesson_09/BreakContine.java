package lesson_09;

// continue, break
// continue завершает текущую иттерацию цикла и переходит к следующей.


public class BreakContine {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("vor if: " + i);
            if (i==4) continue;


            System.out.println("nach: " + i);

            if (i==8) break;
            System.out.println("nach break: " + i);


            for (int j = 1; j <=20 ; j++) {
                if (i% 2 != 0) continue;
                System.out.println(i);

            }


        }
    }
}
