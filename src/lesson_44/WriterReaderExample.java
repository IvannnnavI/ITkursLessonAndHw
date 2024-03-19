package lesson_44;

import java.io.*;
import java.util.Arrays;

public class WriterReaderExample {
    public static void main(String[] args) {

        //создаем директорию
        File path = new File("src/lesson_44/db");
        path.mkdirs();

        // задаем название файла и путь к нему.

        File fileName = new File(path,"text.txt");

        try {
            // создаеи файл на диске
            fileName.createNewFile();
        }catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // создаем экземпляр "писателя".
            FileWriter fileWriter = new FileWriter(fileName);

            //записывает файл
            fileWriter.write("Hello Java!");
            // закрываем ресурс.
            fileWriter.close();
            System.out.println("запись файла закончена.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        // чтение из файла.
        // буферизированные классы не работают с файлами напрямую
        // они являются обертками . При создании буфера мы должны передать в конструктор объект класса, который умеет читать(писать) в файл.

        //cоздаем объект . умеющий читать из файла.
        //FileReader fileReader = new FileReader(fileName);

        // создаем буфер и передаем ему в конструктор читателя.
        //BufferedReader bufferedReader = new BufferedReader(fileReader);

        // try with resources - >

        try (
                // ресурсы , открытые в скобках будут автоматически закрыты .когда работа с кодом будет завершена.
                FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){
            String line;
            line = bufferedReader.readLine();
            System.out.println("Чтение строки завершено.");
            System.out.println("line: " + line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // String[] list () - список имен файлов и названий директорий
        String[] names = path.list();
        System.out.println("names" + Arrays.toString(names));

        // File[] listFiles() - возвращает массив объектов типа File

        File[] files = path.listFiles();
        for (File file1: files) {
            System.out.println(file1.getName()+ " | " + file1.getPath());
        }

    }
}
