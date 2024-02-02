package lesson_05.Hw05;
//Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
//Число: 3 четное: false, кратно 3: true, четное и кратное 3: false

public class hw05task4 {
    public static void main(String[] args) {
        int number = 48;
        int number2 = 3;
// random ranom = new Random()
        // int rand= random.nexint(11)
       // boolean isZero = number ==0;  !isZero &&
       // boolean isZero2 = number2 ==0; !isZero2 &&

        boolean isEven =  number % 2 == 0;
        boolean iDBThre = number % 3 == 0; // isDivisibleByThree
        boolean isEven2 =  number2 % 2 == 0;
        boolean iDBThre2 = number2 % 3 == 0;

        System.out.println("Число: " + number + " четное: " + isEven
                + "; кратно 3: " + iDBThre + "; четное и кратно 3: " + (isEven && iDBThre) );
        System.out.println("Число: " + number2 + " четное: " + isEven2
                + ", кратно 3: " + iDBThre2 + ", четное и кратно 3: " + (isEven2 && iDBThre2) );

    }
}
