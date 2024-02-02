package lesson_07;

public class switchExample {
    public static void main(String[] args) {
        int x = 8;

        if (x == 5) {
            System.out.println("if x == 5");
        }else if (x==7) {
            System.out.println("if x==7");
        }else {
            System.out.println("else x drugoe zna4enie");

        }
//
        switch (x) {
            case 5:
                System.out.println("switch x==5");
                break;
            case 7:
            case 8:
                System.out.println("switch x == 7 or 8");
                break;
            default:
                System.out.println("switch drugoe znachenie");



        }
    }
}
