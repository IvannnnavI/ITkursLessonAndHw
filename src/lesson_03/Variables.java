package lesson_03;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable;

        myFirstVariable = 1;
        int mySecondVariable = 25;

        System.out.println(mySecondVariable);
        mySecondVariable = 50;
        System.out.println(mySecondVariable);
        byte byteVar= 125;
        byteVar = 0;

        System.out.println("Значение переменной byteVar: " + byteVar);

        short shortVar;
        shortVar = 31000;

        long longVariable = 2_100_000_000_000_000_000L;
        System.out.println("longVariable" + longVariable);

        double doubleVar = 10.5421;
        System.out.println("doubleVar= " + doubleVar);

        float floatVar = 11.65F;
    }
}
