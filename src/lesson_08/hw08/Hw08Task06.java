package lesson_08.hw08;

import java.util.Scanner;

/*По желанию. Работа со switch
Task 6
Программа, имитирующая систему управления освещением в доме.
У светильника в каждой комнате есть 4 возможных режима работы: выключен - тусклый - средний - яркий
У пользователя есть пульт управление светом. На пульте несколько кнопок управления для изменения освещения в доме.
 Пользователь выбирает номер кнопки (в вашей программе вы получаете число от пользователя).
Каждая кнопка изменяет интенсивность освещения в разных комнатах.
Режим 1 устанавливает: Гостиная и кухня - яркое свет, спальня - тусклый.
2: Гостиная - тусклый, кухня и спальня - яркий.
3: Везде средний свет.
4: Выключить свет в кухне
5: Увеличить интенсивность света на 1 гостиная и кухня
6: Уменьшить интенсивность света на 2 в спальне
После выбора пользователем режима - вывести в консоль текущее состояние освещения в доме
P.S. Учесть, что, например, если текущее состояние было "средний", то при его увеличении на + 2 состоянии
 останется максимально ярким.
 Т.е. "яркий" Аналогично с уменьшением интенсивности.

 */
public class Hw08Task06 {
    public static void main(String[] args) {
        // принимаю режимы работы за числовые значения. 0 - выключено, 1 - тусклый, 2 - средний, 3 яркий.
        int livingRoom = 0;
        int kitchen = 0;
        int bedroom = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирете номер кнопки (1-6): ");
        int button = scanner.nextInt();

        switch (button) {
            case 1:
                livingRoom = 3;
                kitchen = 3;
                bedroom = 1;
                break;
            case 2:
                livingRoom = 1;
                kitchen = 3;
                bedroom = 3;
                break;
            case 3:
                livingRoom = 2;
                kitchen = 2;
                bedroom = 2;
                break;
            case 4:
                kitchen = 0;
                break;
            case 5:
                if (livingRoom < 3) {
                    livingRoom++;
                }
                if (kitchen < 3) {
                    kitchen++;
                }
                break;
            case 6:
                if (bedroom > 0) {
                    bedroom -= 2;
                } else {
                    bedroom = 0;
                }
                break;
            default:

                System.out.println("Неверный номер кнопки.");
                return;
        }
        System.out.print("Гостиная: ");
        switch (livingRoom) {
            case 0:
                System.out.println("Выключено");
                break;
            case 1:
                System.out.println("Тусклый");
                break;
            case 2:
                System.out.println("Средний");
                break;
            default:
                System.out.println("Яркий");
        }


        System.out.print("Кухня: ");
        switch (kitchen) {
            case 0:
                System.out.println("Выключено");
                break;
            case 1:
                System.out.println("Тусклый");
                break;
            case 2:
                System.out.println("Средний");
                break;
            default:
                System.out.println("Яркий");
        }

        System.out.print("Спальня: ");
        switch (bedroom) {
            case 0:
                System.out.println("Выключено");
                break;
            case 1:
                System.out.println("Тусклый");
                break;
            case 2:
                System.out.println("Средний");
                break;
            default:
                System.out.println("Яркий");
        }
    }
}





