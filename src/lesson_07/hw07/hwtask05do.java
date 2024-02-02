package lesson_07.hw07;

import java.util.Scanner;

public class hwtask05do {
    public static void main(String[] args) {

//        int count = 10;
//        while (count < 5) {
//            System.out.println("telo while loop");
//            count++;
//        }
//
//        count = 4;
//
//        do {
//            System.out.println("telo cikla Do-While");
//            count++;
//        } while (count < 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite hello");
        String hello = scanner.nextLine();

        while (!hello.equalsIgnoreCase("hello")) {
            System.out.println("vvedite hello iz cikla");
            hello = scanner.nextLine();
        }
        System.out.println("Spasibo, do poba4ennya!");

//        do while
        String hellodo;

        do {
            System.out.println("vvedite hello(do-while)");
            hellodo = scanner.nextLine();
        }while (!hellodo.equalsIgnoreCase("hello"));

        System.out.println("spasibo do svidaniya!!!");


    }
}
