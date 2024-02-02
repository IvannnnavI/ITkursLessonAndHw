package lesson_11;

import java.util.Random;

public class Overloading {
    public static void main(String[] args) {

        int[] ints = new int[10];
        fillArray(ints);
        printArray(ints);
        printArray(ints);
        fillArray(ints, 500);



        printNumber(10);
        printNumber(5 , 12);

        printNumber(6, "bac");
        printNumber("mark" , 8);

    } // methods

    private static void printArray(int[] ints) {
        System.out.println("[");
        for (int i = 0; i <ints.length ; i++) {
            System.out.print(ints[i]+ ((i< ints.length - 1)? ";": "]\n")) ;
        }
    }
    public static void fillArray(int[]ints,int n) {
        Random random = new Random();
        for (int i = 0; i <ints.length ; i++) {
            ints[i] = random.nextInt(n + 1);

        }
    }

    public static void fillArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1001);
        }
    }

    static void printNumber (String string, int digit) {
        System.out.println("Hello");
    }

    public static void printNumber (int num, String str){
        for (int i = 1; i <= num ; i++) {
            System.out.print(i + str + " ");

        }
        System.out.println();
    }

    public static void printNumber(int start, int end) {
        System.out.println(" мы в методе 2 инта");
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }


    public static void printNumber(int number) {
        System.out.println("мы в методе один инт");
        printNumber(5,12);
        for (int i = 1; i <= number ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



    public static void sayhello() {
        System.out.println("Hello");
        System.out.println();
    }



}
