package lesson_44.hW_44;
/*
Дан файл с историей поступлений денег на счета пользователей за некий период времени:

user1:2050
user2:1200
user1:1700
user3:1800
user1:1300
user4:2100
user2:750
Данные в виде: <имяПользователя>:<суммаПоступления>.

Ваше задание прочитать данные из файла и обработать их.

Результат обработки должен быть записан в два файла:

less.txt список тех, кому в сумме перечисленно меньше 2000
more.txt список тех, кому в сумме перечисленно 2000 и больше
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FinancialRecordProcessor {

    public static void main(String[] args) {
        processRecords("src/lesson_44/hW_44/input.txt", "src/lesson_44/hW_44/less.txt", "src/lesson_44/hW_44/more.txt");
    }

    public static void processRecords(String inputFile, String lessFile, String moreFile) {
        // Проверяем наличие файла input.txt
        File file = new File(inputFile);
        if (!file.exists()) {
            System.err.println("Файл не найден: " + inputFile);
            return;
        }

        Map<String, Integer> financialRecords = new HashMap<>();

        // Читаем данные из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String user = parts[0];
                int amount = Integer.parseInt(parts[1]);
                financialRecords.merge(user, amount, Integer::sum);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        // Записываем результаты в файлы less.txt и more.txt
        try (PrintWriter lessWriter = new PrintWriter(new File(lessFile));
             PrintWriter moreWriter = new PrintWriter(new File(moreFile))) {
            for (Map.Entry<String, Integer> entry : financialRecords.entrySet()) {
                if (entry.getValue() < 2000) {
                    lessWriter.println(entry.getKey() + ":" + entry.getValue());
                } else {
                    moreWriter.println(entry.getKey() + ":" + entry.getValue());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
