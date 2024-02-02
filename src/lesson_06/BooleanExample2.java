package lesson_06;

public class BooleanExample2 {
    public static void main(String[] args) {

        // XOR -^ логическая исключающая - выдает true если части выражения разные
        boolean bl = true ^ false;
        System.out.println("true ^ false -> " + bl);
        System.out.println("false ^ true -> " + (false ^ true));
        System.out.println("true ^ true -> " + (true ^ true));
        System.out.println("false ^ false -> " + (false ^ false));

        // логическое сокращеное или. и и && работает как и &
        int a = 5;
        int b = 10;
        a = 0;

        boolean b2 = (a != 0) && (b / a > 5);
        System.out.println("b / a > 5 --> " + b2 );


        System.out.println("==================================\n");
        System.out.println(true ^ false );
        System.out.println(true );
        /*
        System.out.println(true ^ false & false);
        1 - !;
        2 -&;
        3 - ^;
        4 - |;
        5 - &&;
        6 - ||
         */

        System.out.println(true ^ false && false);
        System.out.println(false && false);
        System.out.println(false);

        System.out.println("========================================\n");

        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;

        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        System.out.println(true | false | 25 < 100 & !true ^ 2 == 5);
        System.out.println(true | false | 25 < 100 & false ^ false);
        System.out.println(true | false | 25 < 100 & false ^ false);
        System.out.println(true | false | 25 < 100 & false ^ false);
        System.out.println(true | false | 25 < 100 & false ^ false);


    }
}
