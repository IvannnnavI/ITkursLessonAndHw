package lesson_44;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        Создать 10 файлов.
        в каждый файл записать  строку соответсвенно
         */

        File directory = new File("src/lesson_44/db");

        for (int i =1; i<=10; i++){
            File file = new File(directory,"Java " + i + ".txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                writer.write("Java " + i);
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Файлы созданы!");


        File [] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains("Java 7")) {
                            System.out.println("файл содержащий 'Java 7': " + file.getName());
                            break;
                        }
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
