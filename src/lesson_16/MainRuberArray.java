package lesson_16;

public class MainRuberArray {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();

        System.out.println(ra.toString());

        ra.add(15);
        ra.add(-10);
        ra.add(100);

        for (int i = 0; i < 10; i++) {
            ra.add(i);
            System.out.println(ra.toString());
        }
        ra.add(100, 13, 14, 55, 44, 33);
        System.out.println(ra.toString());
    }
}
