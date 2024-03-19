package lesson_44.hW_44;

import java.io.*;

/*
Ваша задача используя классы пакета java.io создать файл с именем 'copy.txt'
 и скопировать в него все данные из файла 'text.txt'
 */
public class FileCopier {
    public static void main(String[] args) {
        String sourcePath = "src/lesson_44/hW_44/text.txt";
        String destinationPath = "src/lesson_44/hW_44/copy.txt";
        copyFile(sourcePath, destinationPath);

    }

    public static void copyFile(String sourceFile, String destinationFile) {
        try {
            // Создаем объект File для целевого файла
            File destination = new File(destinationFile);

            // Проверяем, существует ли целевой файл
            if (!destination.exists()) {
                // Если файл не существует, пытаемся создать его
                boolean created = destination.createNewFile();
                if (created) {
                    System.out.println("Файл " + destinationFile + " был успешно создан.");
                } else {
                    System.err.println("Не удалось создать файл " + destinationFile);
                    return; // Прекращаем выполнение, если файл создать не удалось
                }
            }
            try (FileReader fileReader = new FileReader(sourceFile);
                 FileWriter fileWriter = new FileWriter(destination)) {

                int character;
                while ((character = fileReader.read()) != -1) {
                    fileWriter.write(character);
                }
                System.out.println("Файл успешно скопирован в " + destinationFile);
            } catch (IOException e) {
                System.err.println("Произошла ошибка при копировании файла: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
