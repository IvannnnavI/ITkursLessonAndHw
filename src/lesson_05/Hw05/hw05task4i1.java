package lesson_05.Hw05;

import java.util.Random;

public class hw05task4i1 {
    public static void main(String[] args) {
        Random random = new Random();

        int rand = random.nextInt(11); // [0..11) -> [0..10]

        // четное - число, которое делится на 2 без остатка. т.е. остаток равен 0

        boolean isEven = (rand % 2 == 0);
        boolean isDevByThree = rand % 3 == 0;
        boolean isTwice = isEven & isDevByThree;

        System.out.printf("Число: 6 четное: %s; кратно 3: %s; четное и кратное 3: %s\n", rand, isEven, isTwice, isDevByThree);

    }
}
