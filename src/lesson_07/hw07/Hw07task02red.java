package lesson_07.hw07;

public class Hw07task02red {
    public static void main(String[] args) {
        int grade = (int) (Math.random() * 13);

        // Исходное время для просмотра ТВ
        int remainingTime = 45; // минуты

        switch (grade) {
            case 10:
            case 11:
            case 12:
                System.out.println("Отлично! Ты заслужил больше времени за ТВ.");
                remainingTime += 60; // добавляем 1 час
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Хорошо поработал, но есть куда стремиться.");
                remainingTime += 45; // добавляем 45 минут
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Неплохо, но ты можешь лучше.");
                remainingTime += 15; // добавляем 15 минут
                break;
            case 3:
                System.out.println("Это печально. Надо подтянуть математику.");
                remainingTime -= 30; // уменьшаем на 30 минут
                break;
            default:
                System.out.println("Очень плохо. Сегодня без ТВ.");
                remainingTime = 0; // сегодня без ТВ
        }

        // Ограничение времени до 60 минут
        if (remainingTime > 60) {
            remainingTime = 60;
        }

        System.out.println("Оставшееся время для просмотра ТВ: " + remainingTime + " минут.");
    }

}
