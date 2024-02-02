package lesson_09.homework09;
//*опционально Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
//1
//12
//123
//1234
//12345
//123456
public class Hw09Task03 {
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
