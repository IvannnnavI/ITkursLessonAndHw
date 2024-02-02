package lesson_07;

import java.util.Random;

public class dengiMalusha {
    public static void main(String[] args) {
        Random random = new Random();
        int pocketMoney = 100;
        int grade = random.nextInt(5) + 1;

        System.out.println("Оцeнка ребенка: " + grade);

        switch (grade) {
            case 5:
                pocketMoney += 20;
                break;
            case 4:
                pocketMoney += 10;
                break;
            case 3:
                break;
            case 2:
                pocketMoney -= 20;
                break;
            case 1:
                pocketMoney -= 100;
            default:
        }

        System.out.println("У ребенка сейчас " + pocketMoney + " денег.");
    }
}

