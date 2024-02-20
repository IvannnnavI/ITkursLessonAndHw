package lesson_25;

import lesson_22.Cat;

public class SimpleApp {
    public static void main(String[] args) {
        SimpleBox simpleBox = new SimpleBox(10);
        System.out.println(simpleBox);

        SimpleBox simpleBox1 = new SimpleBox(20);
        System.out.println(simpleBox1);

        int sum = (int) simpleBox.getValue() + (int) simpleBox1.getValue();
        System.out.println("сумма: " + sum);

        //  В коробочку всеё что угодно тип Object щирок
        SimpleBox simpleBox2 = new SimpleBox(new Cat());


        SimpleBox [] boxes = new SimpleBox[3];
        boxes[0] = simpleBox1;
        boxes[1] = simpleBox;
        boxes[2] = simpleBox2;



        int sum1 = 0;

        for (int i = 0; i < boxes.length ; i++) {
            sum1 += (int) boxes[i].getValue();

        }
        System.out.println("Сумма из массива: " + sum1);
    }
}
